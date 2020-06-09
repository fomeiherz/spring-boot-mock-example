package top.fomeiherz.controller;

/**
 * @author fomy
 * @date 2020-06-09 21:48
 * @description
 */
public class JwtUtils {
    
    public static String getName(String name) {
        return "Hello, " + name;
    }

    public static void throwException() {
        throw new RuntimeException("Runtime Exception.");
    }
    
}
