package java.io.github.rahulrajsonu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class IntelliGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(java.io.github.rahulrajsonu.IntelliGatewayApplication.class, args);
    }
}
