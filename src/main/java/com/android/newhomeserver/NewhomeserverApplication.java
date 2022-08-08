package com.android.newhomeserver;

import com.android.newhomeserver.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewhomeserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewhomeserverApplication.class, args);
    }

    Application application = new Application();

}
