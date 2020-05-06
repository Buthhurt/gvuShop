package by.gvu.jd2.bean.err;

public class DaoException extends Exception {
    public DaoException(String message) {
        super(message);
    }

    public DaoException(String message, Exception source){
        super(message, source);
    }
}
