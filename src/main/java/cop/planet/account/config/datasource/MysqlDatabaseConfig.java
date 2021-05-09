package cop.planet.account.config.datasource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MysqlDatabaseConfig {

    @Value("${spring.datasource.url}")
    private String url;

}
