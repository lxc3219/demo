package org.melody.demo.example.service.impl;

import org.melody.demo.example.dao.AMapper;
import org.melody.demo.example.service.AService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AServiceImpl implements AService {

    @Autowired
    private AMapper aMapper;

    @Override
    public void a() {
        aMapper.a();
    }
}
