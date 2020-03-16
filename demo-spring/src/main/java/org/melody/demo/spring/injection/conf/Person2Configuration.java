package org.melody.demo.spring.injection.conf;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Person2Configuration {

    @Bean
    public Person2 inject () {
        return new Person2();
    }
}
