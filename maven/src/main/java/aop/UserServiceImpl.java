package aop;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
class UserServiceImpl implements UserService {

    private HashMap<Long, User> userMap = new HashMap<>();

    public User addUser(User user) {
        userMap.put(user.getId(), user);
        return user;
    }

    @Override
    public User updateUser(User user) {
        userMap.put(user.getId(), user);
        return user;
    }

    @Override
    public void deleteUser(Long id) {
        userMap.remove(id);
    }

    @Override
    public User getUserById(Long id) {
        return userMap.get(id);
    }
}