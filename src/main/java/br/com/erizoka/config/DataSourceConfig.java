package br.com.erizoka.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
    @Bean
    public javax.sql.DataSource getDataSource() {
        return DataSourceBuilder.create()
          .driverClassName("org.postgresql.Driver")
          .url("jdbc:postgresql://localhost:5432/descomplica")
          .username("postgres")
          .password("admin")
          .build();	
    }
}
