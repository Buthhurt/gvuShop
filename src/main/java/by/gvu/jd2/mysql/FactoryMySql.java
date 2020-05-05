package by.gvu.jd2.mysql;

import by.gvu.jd2.dao.UsersMySql;
import by.gvu.jd2.dao.base.Users;

public final class FactoryMySql {
    private static FactoryMySql instance = null;

    private FactoryMySql() {

    }

    public static FactoryMySql getInstance() {
        if (instance==null){
            instance = new FactoryMySql();
        }

        return instance;
    }

    public Users getUsersImpl(){
        return new UsersMySql();
    }
}
