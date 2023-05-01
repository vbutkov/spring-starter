package ru.dmdev.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import ru.dmdev.bpp.Auditing;
import ru.dmdev.bpp.Transaction;
import ru.dmdev.database.pool.Company;
import ru.dmdev.database.pool.ConnectionPool;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Auditing
@Transaction
public class CompanyRepository implements CrudRepository<Integer, Company> {

    private final ConnectionPool connectionPool;

    public CompanyRepository(ConnectionPool pool2) {
        this.connectionPool = pool2;
    }

    @PostConstruct
    private void init() {
        System.out.println("init company repository");
    }

    @Override
    public Optional<Company> findById(Integer id) {
        System.out.println("findById method...");
        return Optional.of(new Company(id));
    }

    @Override
    public void delete(Company entity) {
        System.out.println("delete method...");
    }


    public void info() {
        System.out.println("field connectionPool is initialization: " + connectionPool);
    }
}
