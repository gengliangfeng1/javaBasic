package java_basic.DI;

// 用户服务层，通过构造函数接收UserRepository对象
class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(Long id) {
        return userRepository.findById(id);
    }
}



// 测试类，模拟使用用户服务获取用户信息

