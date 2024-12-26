package aop;

import lombok.Data;

@Data
class User {
    private Long id;
    private String username;
    // 构造函数、Getter和Setter方法等省略，为简化示例

    public User(Long id, String username) {
        this.id = id;
        this.username = username;
    }
}
