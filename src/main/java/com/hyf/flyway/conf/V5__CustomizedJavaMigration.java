package com.hyf.flyway.conf;

import org.flywaydb.core.api.MigrationVersion;
import org.flywaydb.core.api.configuration.Configuration;
import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;
import org.flywaydb.core.api.resolver.ResolvedMigration;
import org.flywaydb.core.extensibility.MigrationType;
import org.flywaydb.core.internal.jdbc.StatementInterceptor;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;

@Component
public class V5__CustomizedJavaMigration extends BaseJavaMigration {

    @Override
    public void migrate(Context context) throws Exception {
        String sql = "INSERT INTO t_user (u_name) VALUES ('张三5')";
        // connection 不能关闭
        try (PreparedStatement statement = context.getConnection().prepareStatement(sql)) {
            statement.execute();
        }

//        new JdbcTemplate(new SingleConnectionDataSource(context.getConnection(), true))
//                .execute("INSERT INTO test_user (name) VALUES ('Obelix')");

        System.out.println();
    }

    @Override
    public MigrationVersion getVersion() {
        return super.getVersion();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public Integer getChecksum() {
        return super.getChecksum();
    }

    @Override
    public boolean canExecuteInTransaction() {
        return super.canExecuteInTransaction();
    }

    @Override
    public ResolvedMigration getResolvedMigration(Configuration config, StatementInterceptor statementInterceptor) {
        return super.getResolvedMigration(config, statementInterceptor);
    }

    @Override
    public MigrationType getType() {
        return super.getType();
    }
}
