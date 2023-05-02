package ru.dmdev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.dmdev.config.ApplicationConfiguration;
import ru.dmdev.database.pool.ConnectionPool;
import ru.dmdev.service.CompanyService;

public class ApplicationRunner {
    public static void main(String[] args) {

        try (
                var context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class)) {
            //var context = new ClassPathXmlApplicationContext("application.context.dmdev.xml")) {

            System.out.println(context.getBean("connectionPool", ConnectionPool.class));
            var companyService = context.getBean("companyService", CompanyService.class);
            System.out.println(companyService.findById(1));


//            companyRepository.delete(new Company(1));
//            companyRepository.info();

        }


    }
}
