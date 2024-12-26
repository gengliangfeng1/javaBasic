package java_basic.DI;

class Main {
    public static void main(String[] args) {
        UserService userService = ApplicationContext.createUserService();
        User user = userService.getUserById(1L);
        System.out.println("获取到的用户：" + user.getUsername());
    }
}