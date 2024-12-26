package java_basic.DI;

// 假设的外部管理类（类似Spring容器做的事），决定注入哪种UserRepository实现
class ApplicationContext {
    public static UserService createUserService() {
        // 这里可以根据配置等情况，选择注入不同的UserRepository实现
        UserRepository userRepository = new UserRepositoryDB();  // 假设现在选择注入基于数据库的实现
        return new UserService(userRepository);
    }
}
