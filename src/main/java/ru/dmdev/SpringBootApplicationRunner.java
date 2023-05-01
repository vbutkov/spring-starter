package ru.dmdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ConfigurableApplicationContext;
import ru.dmdev.config.DatabaseProperties;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringBootApplicationRunner {

    public static void main(String[] args) {
        var context = SpringApplication.run(SpringBootApplicationRunner.class, args);
        System.out.println(context.getBeanDefinitionNames());
        System.out.println(context.getBean(DatabaseProperties.class));
    }
}

