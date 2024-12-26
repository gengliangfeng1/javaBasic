package java_basic.Reflection;

import java.lang.reflect.Constructor;

public class SpringLikeDI {
    public static void main(String[] args) throws Exception {
        Class<?> userServiceClass = UserService.class;
        Class<?> userRepositoryClass = UserRepository.class;
        // 创建UserRepository实例
        UserRepository userRepository = (UserRepository) userRepositoryClass.newInstance();
        // 获取UserService的构造函数，其参数为UserRepository
        Constructor<?> constructor = userServiceClass.getConstructor(UserRepository.class);
        // 通过反射创建UserService实例并注入UserRepository
        UserService userService = (UserService) constructor.newInstance(userRepository);
    }
}