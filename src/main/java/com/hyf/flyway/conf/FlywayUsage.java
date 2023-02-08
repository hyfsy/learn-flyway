package com.hyf.flyway.conf;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.output.BaselineResult;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.stereotype.Component;

//@Component
public class FlywayUsage implements FlywayMigrationStrategy {
    @Override
    public void migrate(Flyway flyway) {
//        flyway.migrate();
        flyway.baseline();
    }
}
