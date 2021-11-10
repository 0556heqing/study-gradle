package com.heqing.gradle.model;

import java.io.Serializable;

/**
 * @author heqing
 * @date 2021/8/2 16:18
 */
public class Demo implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
