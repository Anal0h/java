package java.Task5;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
    }

    public WrongLoginException(String text) {
        super(text);
    }
}