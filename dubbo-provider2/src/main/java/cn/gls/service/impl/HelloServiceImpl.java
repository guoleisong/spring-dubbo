package cn.gls.service.impl;

import cn.gls.service.HelloService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @Author ljr
 * @Date 2019/8/13 14:27
 * @ClassName HelloServiceImpl
 */
@Component
@Service
public class HelloServiceImpl implements HelloService{
    @Override
    public String sayHello(String name) {
        return "Hello :"+name;
    }
}
