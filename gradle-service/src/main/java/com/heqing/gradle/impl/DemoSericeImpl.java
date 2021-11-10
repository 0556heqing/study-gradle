package com.heqing.gradle.impl;

import com.heqing.gradle.model.Demo;
import com.heqing.gradle.service.DemoSerice;

/**
 * @author heqing
 * @date 2021/8/2 16:21
 */
public class DemoSericeImpl implements DemoSerice {

    @Override
    public String hello(Demo demo) {
        String str = "test";
        if(demo != null && demo.getName() != null) {
            str = demo.getName();
        }
        return "hello " + str;
    }
}
