package by.shymko.firstproject.exceptions;

/**
 * Created by Andrey on 17.02.2015.
 */
public class ReadFileNotFoundException extends Exception{
    public ReadFileNotFoundException() {
    }

    public ReadFileNotFoundException(String message) {
        super(message);
    }

    public ReadFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReadFileNotFoundException(Throwable cause) {
        super(cause);
    }

    public ReadFileNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
