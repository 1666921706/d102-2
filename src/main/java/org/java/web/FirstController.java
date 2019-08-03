package org.java.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:严辉
 * @Date: 2019/8/3 15:08
 * @Description
 */

@RestController
public class FirstController {

    @GetMapping("first")
    public String first(){

        return "hello world";
    }
}
