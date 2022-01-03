package day01;

public class NormalUser implements User {

    private String name;
    private String password;

    public NormalUser(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String getUserName() {
        return name;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
