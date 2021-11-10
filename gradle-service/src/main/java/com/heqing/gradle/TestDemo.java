package com.heqing.gradle;

import com.heqing.gradle.impl.DemoSericeImpl;
import com.heqing.gradle.model.Demo;
import com.heqing.gradle.service.DemoSerice;

public class TestDemo {

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.setName("gradle");

        DemoSerice demoSerice = new DemoSericeImpl();
        String str = demoSerice.hello(demo);

        System.out.println("--> " + str);
    }
}
