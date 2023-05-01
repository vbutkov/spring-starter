package ru.dmdev.repository;

import org.springframework.stereotype.Repository;
import ru.dmdev.database.pool.ConnectionPool;

@Repository
public class UserRepository {

    private ConnectionPool connectionPool;

    public UserRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }
}
