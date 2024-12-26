package aop;

public class UserServiceAopTest {
    public static void main(String[] args) {
        User user = new User(1L, "testUser");

        UserService userService = new UserServiceImpl();
        User result = userService.addUser(user);
    }
}