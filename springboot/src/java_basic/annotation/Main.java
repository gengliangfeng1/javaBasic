package java_basic.annotation;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("John", "123456");
        System.out.println("User 1验证结果: " + Validator.validate(user1));

        User user2 = new User(null, "abcdef");
        System.out.println("User 2验证结果: " + Validator.validate(user2));
    }
}
