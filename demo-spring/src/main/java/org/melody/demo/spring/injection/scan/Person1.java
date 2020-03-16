package org.melody.demo.spring.injection.scan;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class Person1 {

    private String name = "tom";

    private String sex = "man";

    private String addr;
}
