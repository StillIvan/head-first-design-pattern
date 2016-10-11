package com.github.oycharming.pattern.command.undo;

/**
 * @author Charming
 * @since 2016-09-04 23:27
 */
public class Light {
    /**
     * 灯的名字
     */
    private String name = "The";

    public Light() {
    }

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this.name + " light is on.");
    }

    public void off() {
        System.out.println(this.name + " light is off.");
    }
}
