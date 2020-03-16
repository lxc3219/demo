package org.melody.demo.spring.exception;

import org.springframework.stereotype.Service;

@Service
public class ExceptionService {

    public void test() throws RuntimeException {
        throw new RuntimeException("我错了~");
    }
}
