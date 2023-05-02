package ru.dmdev.repository;

import org.springframework.stereotype.Repository;
import ru.dmdev.database.pool.ConnectionPool;

@Repository
public class UserRepository {

    private ConnectionPool pool1;

    public UserRepository(ConnectionPool pool1) {
        this.pool1 = pool1;
    }
}
