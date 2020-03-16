package org.melody.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class BootstrapTest {

    @Autowired
    private BeanFactory beanFactory;

    /**
     * 获取自动配置包路径
     */
    @Test
    public void test() {
        List<String> packages = AutoConfigurationPackages.get(beanFactory);
        System.out.println(packages.toString());
    }
}
