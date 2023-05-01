package ru.alishev;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.alishev")
@PropertySource("classpath:music.player.properties")
public class SpringConfig {
}
