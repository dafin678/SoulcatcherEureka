package id.ac.ui.cs.advprog.soulcatchereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class SoulcatcherEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoulcatcherEurekaApplication.class, args);
    }

}
