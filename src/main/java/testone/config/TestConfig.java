package testone.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jdbc.repository.RowMapperMap;
import org.springframework.data.jdbc.repository.config.ConfigurableRowMapperMap;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.jdbc.repository.config.JdbcConfiguration;
import testone.domain.Account3;
import testone.dao.Account3Mapper;

@Configuration
@EnableJdbcRepositories(basePackages = "testone.dao")
@Import(JdbcConfiguration.class)
public class TestConfig {
    @Bean
    RowMapperMap mappers(){
        return new ConfigurableRowMapperMap()
                .register(Account3.class, new Account3Mapper());
    }
}
