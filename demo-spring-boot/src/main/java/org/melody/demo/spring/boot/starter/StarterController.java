package org.melody.demo.spring.boot.starter;

import org.melody.demo.spring.boot.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/starter")
@RestController
public class StarterController {

    @Autowired
    private People people;

    /**
     * localhost:8080/demo/starter/greet
     */
    @GetMapping("/greet")
    public void greet() {
        System.out.println(people.greet());
    }

}
