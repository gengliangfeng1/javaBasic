package java_basic.DI;

import java.util.ArrayList;
import java.util.List;

// 用户数据访问层，最初基于内存模拟存储用户数据
class UserRepository {
    private List<User> users = new ArrayList<>();

    public UserRepository() {
        // 初始化一些用户数据到内存中
        User user1 = new User();
        user1.setId(1L);
        user1.setUsername("user1");
        users.add(user1);

        User user2 = new User();
        user2.setId(2L);
        user2.setUsername("user2");
        users.add(user2);
    }

    public User findById(Long id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }
}
