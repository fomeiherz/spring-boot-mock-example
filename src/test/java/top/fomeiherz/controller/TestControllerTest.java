package top.fomeiherz.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author fomy
 * @date 2020-06-09 21:28
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestControllerTest {
    
    @Autowired
    TestController testController;

    @Test
    public void test() {
        System.out.println(testController.test());
    }
}