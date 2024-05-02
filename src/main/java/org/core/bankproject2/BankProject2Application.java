package org.core.bankproject2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("org.core.bankproject2.data")
public class BankProject2Application {

    public static void main(String[] args) {
        SpringApplication.run(BankProject2Application.class, args);
    }

}
