package ru.dmdev.integration.service;


import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import ru.dmdev.database.pool.ConnectionPool;
import ru.dmdev.integration.annotation.IT;
import ru.dmdev.service.UserService;

@IT
@RequiredArgsConstructor
//@SpringBootTest
//
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = ApplicationRunner.class,
//initializers = ConfigDataApplicationContextInitializer.class)
public class UserServiceIT {

    private final UserService userService;

    private final ConnectionPool pool1;

    @Test
    void test() {
        System.out.println();
    }
}
