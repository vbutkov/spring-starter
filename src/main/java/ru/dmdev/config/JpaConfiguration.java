package ru.dmdev.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import ru.dmdev.config.condition.JpaCondition;

import javax.annotation.PostConstruct;


@Conditional(JpaCondition.class)
@Configuration
public class JpaConfiguration {

    private static final Logger log = LoggerFactory.getLogger(JpaConfiguration.class);

//    @Bean
//    @ConfigurationProperties(prefix = "db")
//    public DatabaseProperties databaseProperties() {
//        return new DatabaseProperties();
//    }

    @PostConstruct
    void init() {
        log.info("Jpa configuration is enabled");
//        System.out.println("Jpa configuration is enabled");
    }
}
