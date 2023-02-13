package com.hyf.flyway.conf;

import jakarta.annotation.Resource;
import org.flywaydb.core.Flyway;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

// @Component
public class BaselineFlywayMigrationStrategy implements FlywayMigrationStrategy {

    @Resource
    private ConfigurableApplicationContext context;

    @Override
    public void migrate(Flyway flyway) {
        flyway.baseline();
        context.close();
    }
}
