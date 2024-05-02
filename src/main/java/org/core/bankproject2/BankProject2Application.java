package org.core.bankproject2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;

import javax.sql.DataSource;

@SpringBootApplication
public class BankProject2Application {

    public static void main(String[] args) {
        SpringApplication.run(BankProject2Application.class, args);
    }

}
