package org.java.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:严辉
 * @Date: 2019/8/3 11:31
 * @Description
 */

@RestController
public class GitController {

    @GetMapping("init")
    public String init(){
        return "hello..12345";
    }
}
