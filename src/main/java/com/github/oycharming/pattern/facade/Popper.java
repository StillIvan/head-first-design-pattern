package com.github.oycharming.pattern.facade;

/**
 * @author Charming
 * @since 2016-09-07 09:30
 */
public class Popper {
    /**
     * 打开爆米花机
     */
    public void on() {
        System.out.println("Popper is on.");
    }

    /**
     * 关闭爆米花机
     */
    public void off() {
        System.out.println("Popper is off.");
    }

    /**
     * 开始爆米花
     */
    public void pop() {
        System.out.println("Popper is popping.");
    }
}
