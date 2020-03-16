package org.melody.demo.spring.boot;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class People {

    private String name;

    private String gender;

    public People(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String greet() {
        return "Hi，我叫" + name + "，性别" + gender;
    }
}
