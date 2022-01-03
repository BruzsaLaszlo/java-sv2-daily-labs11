package day01;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AdminUserTest {

    String userName = "Pistike";
    String password = "12345";

    AdminUser adminUser = new AdminUser(userName, password);


    @Test
    void getUserName() {
        assertEquals(userName, adminUser.getUserName());
    }

    @Test
    void getPassword() {
        
        assertTrue(() -> {
            String expected = adminUser.getPassword();
            int randomInt = new Random().nextInt(expected.length());
            return '*' == expected.charAt(randomInt);
        });

    }
}