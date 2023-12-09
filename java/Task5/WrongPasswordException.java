package java.Task5;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
    }

    public WrongPasswordException(String text) {
        super(text);
    }
}
