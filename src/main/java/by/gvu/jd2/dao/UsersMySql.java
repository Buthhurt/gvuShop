package by.gvu.jd2.dao;

import by.gvu.jd2.bean.*;
import by.gvu.jd2.bean.err.DaoException;
import by.gvu.jd2.dao.base.Users;
import by.gvu.jd2.dao.base.pool.ConnectionPool;
import by.gvu.jd2.dao.base.pool.ConnectionPoolException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsersMySql implements Users {
    @Override
    public boolean registerUser(User user) throws DaoException {
        if (checkLogin(user))
            throw new DaoException("Такой логин уже есть", null);

        ConnectionPool pool = null;
        try {
            pool = ConnectionPool.getInstance();
        } catch (ConnectionPoolException e) {
            e.printStackTrace();
            throw new DaoException("Ошибка получения полу соединений", e);
        }

        try(Connection connection = pool.takeConnection()) {

            PreparedStatement preparedStatement =  connection.prepareStatement("INSERT INTO USERS (LOGIN, PSW_SHA3, PSW_MD5, EMAIL, ROLE, FNAME, SNAME, NNAME, SEX, BIRTHDAY) VALUES (?,?,?,?,?,?,?,?,?,?)");

            preparedStatement.setString(1, user.getLogin());
            preparedStatement.setString(2, user.getPsw_sha3());
            preparedStatement.setString(3, user.getPsw_md5());
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setInt(5, user.getRole().getId());
            preparedStatement.setString(6, user.getfName());
            preparedStatement.setString(7, user.getsName());
            preparedStatement.setString(8, user.getnName());
            preparedStatement.setInt(9, user.getSexId());
            preparedStatement.setTimestamp(10, user.getBirthday());

            return (preparedStatement.executeUpdate() > 0);

        } catch (SQLException e) {
            e.printStackTrace();
            throw new DaoException("Ошибка при добавлении пользователя", e);
        } catch (ConnectionPoolException e) {
            e.printStackTrace();
            throw new DaoException("Ошибка получения полу соединений", e);
        }
    }

    @Override
    public UserForm loginUser(String userLogin, String userPassword) throws DaoException {
        return loginUser(userLogin, userPassword, "");
    }

    @Override
    public UserForm loginUser(String userLogin, String userPassword, String sessionId) throws DaoException {
        return null;
    }

    @Override
    public boolean logoutUser(UserForm user) throws DaoException {
        return false;
    }

    @Override
    public User getUserInfo(UserForm user) throws DaoException {
        return null;
    }

    @Override
    public List<Address> getUserAddresses(UserForm user) throws DaoException {
        return null;
    }

    @Override
    public List<PaymentMethod> getUserPaymentMethods(UserForm user) throws DaoException {
        return null;
    }

    @Override
    public List<User> findUsers(User userFilter) throws DaoException {
        ConnectionPool pool = null;
        StringBuilder statement = new StringBuilder();
        List<Object> params = new ArrayList<>();
        List<User> result = new ArrayList<>();

        try {
            pool = ConnectionPool.getInstance();
        } catch (ConnectionPoolException e) {
            e.printStackTrace();
            throw new DaoException("Ошибка получения полу соединений", e);
        }

        statement.append("SELECT ID, LOGIN, EMAIL, ROLE, FNAME, SNAME, NNAME, SEX, BIRTHDAY FROM GVUSHOP.USERS WHERE 1=1 ");
        if (userFilter!=null){
            if (userFilter.getId() != -1) {
                statement.append(" AND ID=?");
                params.add(userFilter.getId());
            }

            if (userFilter.getLogin() != null) {
                statement.append(" AND LOGIN=?");
                params.add(userFilter.getLogin());
            }

            if (userFilter.getEmail() != null) {
                statement.append(" AND EMAIL=?");
                params.add(userFilter.getEmail());
            }

            if (userFilter.getRole() != null) {
                statement.append(" AND ROLE=?");
                params.add(userFilter.getRole().getId());
            }

            if (userFilter.getfName() != null) {
                statement.append(" AND FNAME=?");
                params.add(userFilter.getfName());
            }

            if (userFilter.getsName() != null) {
                statement.append(" AND SNAME=?");
                params.add(userFilter.getsName());
            }

            if (userFilter.getnName() != null) {
                statement.append(" AND NNAME=?");
                params.add(userFilter.getnName());
            }

            if (userFilter.getSexId() != -1) {
                statement.append(" AND SEX=?");
                params.add(userFilter.getSexId());
            }

            if (userFilter.getBirthday() != null) {
                statement.append(" AND BIRTHDAY=?");
                params.add(userFilter.getBirthday());
            }
        }

        try(Connection connection = pool.takeConnection()) {

            PreparedStatement psFindUsers =  connection.prepareStatement(statement.toString());

            for (int i=0; i<params.size(); i++) {
                if (params.get(i).getClass() == Timestamp.class) {
                    psFindUsers.setTimestamp(i + 1, (Timestamp) params.get(i));
                } else if (params.get(i).getClass() == Integer.class){
                    psFindUsers.setInt(i + 1, (Integer) params.get(i));
                } else if (params.get(i).getClass() == String.class){
                    psFindUsers.setString(i + 1, (String) params.get(i));
                } else {
                    psFindUsers.setObject(i + 1, params.get(i));
                }
            }

            ResultSet rsFindUsers = psFindUsers.executeQuery();

            while (rsFindUsers.next()){
                User resultUser = new User();
                resultUser.setId(rsFindUsers.getInt("ID"));
                resultUser.setLogin(rsFindUsers.getString("LOGIN"));
                resultUser.setEmail(rsFindUsers.getString("EMAIL"));
                resultUser.setRole(new Role(rsFindUsers.getInt("ID")));
                resultUser.setfName(rsFindUsers.getString("FNAME"));
                resultUser.setsName(rsFindUsers.getString("SNAME"));
                resultUser.setnName(rsFindUsers.getString("NNAME"));
                resultUser.setSexId(rsFindUsers.getInt("SEX"));
                resultUser.setBirthday(rsFindUsers.getTimestamp("BIRTHDAY"));

                result.add(resultUser);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new DaoException("Ошибка при поиске пользователей", e);
        } catch (ConnectionPoolException e) {
            e.printStackTrace();
            throw new DaoException("Ошибка получения пула соединений", e);
        }

        return result;
    }

    private boolean checkLogin(User user) throws DaoException {
        boolean result = true;

        ConnectionPool pool = null;
        try {
            pool = ConnectionPool.getInstance();
        } catch (ConnectionPoolException e) {
            e.printStackTrace();
            throw new DaoException("Ошибка получения полу соединений", e);
        }

        try(Connection connection = pool.takeConnection()) {

            System.out.println("Проверка логина ["+user.getLogin()+"]");
            PreparedStatement checkLoginStmt = connection.prepareStatement("SELECT ID FROM GVUSHOP.USERS WHERE LOGIN=?");
            checkLoginStmt.setString(1, user.getLogin());

            ResultSet checkLoginRs = checkLoginStmt.executeQuery();

            result = checkLoginRs.next();

            //pool.closeConnection(connection, checkLoginStmt, checkLoginRs);
        } catch (ConnectionPoolException e) {
            e.printStackTrace();
            throw new DaoException(e.getMessage(), e);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DaoException(e.getMessage(), e);
        }

        System.out.println("Результат проверки логина ["+result+"]");

        return result;
    }
}
