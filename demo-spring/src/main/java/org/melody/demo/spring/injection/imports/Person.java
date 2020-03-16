package org.melody.demo.spring.injection.imports;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Person {

    private String name = "tom";

    private String sex = "man";

    private String addr;
}
