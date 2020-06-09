package top.fomeiherz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fomy
 * @date 2020-06-09 21:47
 * @description
 */
@RestController
public class TestStaticController {

    @GetMapping("/static")
    public String test() {
        System.out.println(JwtUtils.getName("lilei"));
        return "I'm a static test.";
    }

    @GetMapping("/static/throw")
    public String testThrow() {
        JwtUtils.throwException();
        return "I'm a static throw test.";
    }
    
}
