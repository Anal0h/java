package java.Task6;

public record Contact(String name, String email) {
    public Contact(String name, String email) {
        String substr = email.substring(email.length() - 10);
        if (name != null && name != "" && email != null && (substr.equals("@gmail.com"))) {
            this.name = name;
            this.email = email;
        } else {
            if ((name == null || name == "") && (email == null || !(substr.equals("@gmail.com")))) {
                System.out.println("Ошибка в имени пользователя и адресе почты!");
                this.name = "Пользователь";
                this.email = "new@gmail.com";
            } else {
                if (email == null || !(substr.equals("@gmail.com"))) {
                    System.out.println("Ошибка адреса электронной почты!");
                    this.name = name;
                    this.email = "new@gmail.com";
                } else {
                    System.out.println("Ошибка в имени пользователя!");
                    this.name = "Пользователь";
                    this.email = email;
                }
            }
        }
    }

    public Contact(String name) {
        this(name, "new@gmail.com");
    }

    public void sayHello() {
        System.out.println("Привет, " + name + "!");
    }
}
