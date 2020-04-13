package Lecture12;

public class Task3Exception extends Exception{

    public Task3Exception() {
    }

    public Task3Exception(String message) {
        super(message);
    }

    public Task3Exception(String message, Throwable cause) {
        super(message, cause);//
    }

    public Task3Exception(Throwable cause) {
        super(cause);
    }

    public Task3Exception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
