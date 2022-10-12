package cn.zchenger.gataway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassNameDemoController
 * @Description TODO
 * @Author shuzhongping
 * @DATE 2022/10/12 16:44
 **/
@RestController
@RequestMapping("/api")
public class DemoController {

    @RequestMapping("/test")
    public String  test(){

        return "hello world";
    }
}
