package by.gvu.jd2.dao.base.pool;

import java.sql.Connection;
import java.util.concurrent.BlockingQueue;

public final class ConnectionPoolException extends Exception {
    private static final long serialVersionUID = 1L;

    public ConnectionPoolException(String message, Exception e){
        super(message, e);
    }
}
