package java_basic.annotation;

class User {
    @ValidateNotNull(message = "用户名不能为空")
    private String username;

    @ValidateNotNull
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}