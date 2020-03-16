package org.melody.demo.spring.injection.imports;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 使用在类上添加 @Inport(xxx.class) 将 bean 注入 IOC 容器
 */
@Import({Person.class, MyImportSelector.class})
@RequestMapping("/inject")
@RestController
public class ImportInjectController {

    @Autowired
    private Person person;

    @Autowired
    private Person3 person3;

    @Autowired
    private Person4 person4;

    /**
     * localhost:8080/demo/inject/import/111
     * @param word
     */
    @GetMapping("/import/{word}")
    public void inject(@PathVariable String word) {
        System.out.println(person.getName());
    }

    /**
     * localhost:8080/demo/inject/import/batch/111
     * @param word
     */
    @GetMapping("/import/batch/{word}")
    public void batchInject(@PathVariable String word) {
        System.out.println(person3.getName() + " " + person4.getName());
    }

}
