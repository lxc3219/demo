package org.melody.demo.spring.injection.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Configuration + @Bean 将 bean 注入 IOC 容器
 */
@RequestMapping("/inject")
@RestController
public class ConfInjectController {

    @Autowired
    private Person2 person2;

    /**
     * localhost:8080/demo/inject/conf/111
     * @param word
     */
    @GetMapping("/conf/{word}")
    public void inject(@PathVariable String word) {
        System.out.println(person2.getName());
    }

}
