package java.Task5;

public class Task5 {
    public static void main(String[] args) {
        String login = "log";
        String password = "password";
        String confirmPassword = "pasword";
        try {
            boolean flag = cheacker(login, password, confirmPassword);
            System.out.println(flag);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e);
            System.out.println(false);
        }
        try {
            boolean flag = cheacker(login, password, password);
            System.out.println(flag);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e);
            System.out.println(false);
        }
    }

    public static boolean cheacker(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (login.length() >= 20) {
            throw new WrongLoginException("Слишком длинный логин");
        }
        for (int i = 0; i < login.length(); ++i) {
            if (!((login.charAt(i) >= 48 && login.charAt(i) <= 57) || (login.charAt(i) >= 65 && login.charAt(i) <= 90) || (login.charAt(i) >= 97 && login.charAt(i) <= 122) || (login.charAt(i) == 95))) {
                throw new WrongLoginException();
            }
        }
        if (password.length() >= 20) {
            throw new WrongPasswordException("Слишком длинный пароль");
        }
        for (int i = 0; i < login.length(); ++i) {
            if (!((password.charAt(i) >= 48 && password.charAt(i) <= 57) || (password.charAt(i) >= 65 && password.charAt(i) <= 90) || (password.charAt(i) >= 97 && password.charAt(i) <= 122) || (password.charAt(i) == 95))) {
                throw new WrongPasswordException();
            }
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
        return true;
    }
}
