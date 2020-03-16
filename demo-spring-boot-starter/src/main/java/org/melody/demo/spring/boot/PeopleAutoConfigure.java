package org.melody.demo.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(People.class)
@EnableConfigurationProperties(PeopleProperties.class)
public class PeopleAutoConfigure {

    @Autowired
    private PeopleProperties peopleProperties;

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "people", value = "enabled", havingValue = "true")
    public People people() {
        return new People(peopleProperties.getName(), peopleProperties.getGender());
    }
}
