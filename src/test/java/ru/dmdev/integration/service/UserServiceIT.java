package ru.dmdev.integration.service;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.dmdev.bpp.Auditing;
import ru.dmdev.config.DatabaseProperties;
import ru.dmdev.database.pool.ConnectionPool;
import ru.dmdev.dto.CompanyReadDto;
import ru.dmdev.integration.annotation.IT;
import ru.dmdev.service.CompanyService;
import ru.dmdev.service.UserService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


//@ActiveProfiles("test")
@IT
@RequiredArgsConstructor
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
