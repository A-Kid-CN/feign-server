package cn.backurl.feign.controller;

import cn.backurl.feign.service.SchedualServiceHi;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *
 * </p>
 *
 * @author: akid
 * @create: 2019-11-06 21:16
 **/
@RestController
public class HiController {


    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHi(String name) {
        System.out.println("hhhh");
        return schedualServiceHi.sayHiFromClientOne( name );
    }
}
