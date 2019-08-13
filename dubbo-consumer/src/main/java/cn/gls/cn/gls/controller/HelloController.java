package cn.gls.cn.gls.controller;

import cn.gls.service.HelloService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ljr
 * @Date 2019/8/13 14:39
 * @ClassName HelloController
 */
@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello(){
        String hello =  helloService.sayHello("world");
        System.out.println(helloService.sayHello("gls"));
        return hello;
    }


}
