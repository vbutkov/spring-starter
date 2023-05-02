package ru.dmdev.integration.service;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import ru.dmdev.config.DatabaseProperties;
import ru.dmdev.dto.CompanyReadDto;
import ru.dmdev.integration.annotation.IT;
import ru.dmdev.service.CompanyService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@IT
@RequiredArgsConstructor
//@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)

//@ActiveProfiles("test")
//@SpringBootTest

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = ApplicationRunner.class,
//initializers = ConfigDataApplicationContextInitializer.class)
public class CompanyServiceIT {

    public static final Integer COMPANY_ID = 1;

    private final CompanyService companyService;

    private final DatabaseProperties databaseProperties;

    @Test
    void findById() {
        var actualResult = companyService.findById(COMPANY_ID);

        assertTrue(actualResult.isPresent());

        var expectedResult = new CompanyReadDto(COMPANY_ID);
        actualResult.ifPresent(actual -> assertEquals(expectedResult, actual));

    }
}
