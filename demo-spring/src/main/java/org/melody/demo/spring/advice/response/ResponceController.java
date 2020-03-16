package org.melody.demo.spring.advice.response;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/response")
@RestController
public class ResponceController {

    @GetMapping("/test1")
    public String test1() {
        String result = "aa";
        return result;
    }

    @GetMapping("/test2")
    public CommonResult test2() {
        String result = "aa";
        return new CommonResult().data(result);
    }

    @GetMapping("/test3")
    public String test3() {
        String result = "aa";
        if (result.equalsIgnoreCase("aa")) {
            throw new RuntimeException("aaaa");
        }
        return result;
    }

    @GetMapping("/test4")
    public CommonResult test4() {
        String result = "aa";
        if (result.equalsIgnoreCase("aa")) {
            throw new RuntimeException("aaaa");
        }
        return new CommonResult().data(result);
    }

}
