package ru.dmdev.database.pool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.dmdev.config.JpaConfiguration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Map;

@Component
public class ConnectionPool {
    private final String username;
    private final Integer poolSize;
    private static final Logger log = LoggerFactory.getLogger(ConnectionPool.class);

    public ConnectionPool(@Value("${db.username}") String username,
                          @Value("${db.pollSize}") Integer poolSize) {
        this.username = username;
        this.poolSize = poolSize;
    }

    public Integer getPoolSize() {
        return poolSize;
    }

    @PostConstruct
    private void init() {
        log.info("Init connection pool");
//        System.out.println("Init connection pool");
    }

    @PreDestroy
    private void destroy() {
        log.info("Clean connection pool");
//        System.out.println("Clean connection pool");
    }
}

