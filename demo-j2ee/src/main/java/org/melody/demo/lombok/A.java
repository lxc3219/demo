package org.melody.demo.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class A {

    private String name;

    private Integer num;
}
