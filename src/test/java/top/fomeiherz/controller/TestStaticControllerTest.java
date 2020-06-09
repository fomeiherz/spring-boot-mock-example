package top.fomeiherz.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author fomy
 * @date 2020-06-09 21:48
 * @description
 */
@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(SpringRunner.class)
@PowerMockIgnore( {"javax.management.*", "javax.net.*"})
@PrepareForTest(JwtUtils.class)
@SpringBootTest
public class TestStaticControllerTest {

    @Autowired
    TestStaticController testStaticController;

    /**
     * 静态有返回值的测试
     */
    @Test
    public void test() {
        PowerMockito.mockStatic(JwtUtils.class);
        PowerMockito.when(JwtUtils.getName(Mockito.anyString())).thenReturn("Hello, hanmeimei");

        testStaticController.test();
    }

    /**
     * 静态 void 方法的测试
     * 
     * @throws Exception 异常
     */
    @Test
    public void testThrow() throws Exception {
        PowerMockito.mockStatic(JwtUtils.class);
        PowerMockito.doNothing().when(JwtUtils.class, "throwException");
        
        testStaticController.testThrow();
    }
}
