package com.jmm.blog;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author  jmm
 * @date  2021/8/14 20:03
 * @version 1.0
 * @email 2867405686@qq.com
 */
@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/love")
    public  String gegg(){
        return "love.html";
    }
}
