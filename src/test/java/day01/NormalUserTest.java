package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NormalUserTest {

    String userName = "Pistike";
    String password = "12345";

    NormalUser normalUser = new NormalUser(userName, password);


    @Test
    void getUserName() {
        assertEquals(userName, normalUser.getUserName());
    }

    @Test
    void getPassword() {
        assertEquals(password, normalUser.getPassword());
    }
}