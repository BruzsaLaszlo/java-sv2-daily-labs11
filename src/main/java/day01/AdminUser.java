package day01;

public class AdminUser implements User {

    private String userName;
    private String password;

    public AdminUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public String getPassword() {
        return "*".repeat(password.length());
    }
}
