package com.github.stillivan.pattern.facade;

/**
 * @author Charming
 * @since 2016-09-07 09:31
 */
public class Light {
    /**
     * 将灯光调暗
     * @param brightness 亮度，0-100，比如取值 10，则是 10%
     */
    public void dim(int brightness) {
        System.out.println("Light is turned into " + brightness + "%");
    }

    /**
     * 开启灯光到正常亮度
     */
    public void on() {
        System.out.println("Light is on.");
    }
}
