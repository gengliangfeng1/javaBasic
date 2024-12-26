package aop;

interface UserService {
    User addUser(User user);

    User updateUser(User user);

    void deleteUser(Long id);

    User getUserById(Long id);
}