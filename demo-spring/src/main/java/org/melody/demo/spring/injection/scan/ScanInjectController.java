package org.melody.demo.spring.injection.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ComponentScan + @Component或@Component扩展的注解 将 bean 注入 IOC 容器
 */
@RequestMapping("/inject")
@RestController
public class ScanInjectController {

    @Autowired
    private Person1 person1;

    /**
     * localhost:8080/demo/inject/scan/111
     * @param word
     */
    @GetMapping("/scan/{word}")
    public void inject(@PathVariable String word) {
        System.out.println(person1.getName());
    }

}
