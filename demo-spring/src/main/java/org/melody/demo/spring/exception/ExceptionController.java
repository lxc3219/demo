package org.melody.demo.spring.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {

    @Autowired
    private ExceptionService exceptionService;

    public void test() {
        this.exceptionService.test();
    }
}
