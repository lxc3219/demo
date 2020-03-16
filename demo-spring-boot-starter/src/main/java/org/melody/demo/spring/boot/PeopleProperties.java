package org.melody.demo.spring.boot;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "people")
public class PeopleProperties {

    private boolean enabled;

    private String name;

    private String gender;
}
