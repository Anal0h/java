package Task1;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(equals("AbC", "aBC"));
        System.out.println(replace("aaaasas", "s", "hh"));
        System.out.println(format("Иванов", 5, "java"));
        System.out.println(isPalindrome("шалаш"));
        System.out.println("");
    }

    static boolean equals(String s, String t) {
        String a = s.toLowerCase();
        String b = t.toLowerCase();
        return a.equals(b);
    }

    static String replace(String str, String oldStr, String newStr) {
        return str.replace(oldStr, newStr);
    }

    static String format(String surname, int mark, String subject) {
        return "Студент " + surname + " получил " + mark + " по " + subject + ".";
    }

    static boolean isPalindrome(String str) {
        boolean flag = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                flag = false;
            }
        }
        return flag;
    }
}
