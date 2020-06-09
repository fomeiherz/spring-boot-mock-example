package top.fomeiherz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fomy
 * @date 2020-06-09 21:27
 * @description
 */
@RestController
public class TestController {
    
    @GetMapping
    public String test() {
        return "I'm a test.";
    }
    
}
