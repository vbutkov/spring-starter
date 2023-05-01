package ru.dmdev.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Component;
import ru.dmdev.database.pool.ConnectionPool;
import ru.dmdev.repository.CrudRepository;
import ru.dmdev.repository.UserRepository;

@Import(WebConfiguration.class)
@Configuration
@PropertySource("classpath:application.properties_")
@ComponentScan(basePackages = "ru.dmdev",
        useDefaultFilters = false,
        includeFilters = {
                @Filter(type = FilterType.ANNOTATION, value = Component.class),
                @Filter(type = FilterType.ASSIGNABLE_TYPE, value = CrudRepository.class),
                @Filter(type = FilterType.REGEX, pattern = "ru\\..+Repository")
        })
public class ApplicationConfiguration {

    @Bean("pool2")
    public ConnectionPool poll2(@Value("${db.username}") String name) {
        return new ConnectionPool(name, 30);
    }

    @Bean("pool3")
    public ConnectionPool pool3() {
        return new ConnectionPool("test-pool", 25);
    }

    @Bean
    public UserRepository userRepository2(ConnectionPool pool2) {
        return new UserRepository(pool2);
    }

    @Bean
    public UserRepository userRepository3() {
        return new UserRepository(pool3());
    }
}
