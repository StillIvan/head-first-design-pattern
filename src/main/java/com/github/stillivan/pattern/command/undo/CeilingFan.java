package com.github.stillivan.pattern.command.undo;

/**
 * 多个档位的吊扇.
 * @author Charming
 * @since 2016-09-05 10:36
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String name = "The";
    int speed = OFF;

    public CeilingFan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void high() {
        this.speed = HIGH;
        System.out.println(this.name + " ceiling fan is high.");
    }

    public void medium() {
        this.speed = MEDIUM;
        System.out.println(this.name + " ceiling fan is medium.");
    }

    public void low() {
        this.speed = LOW;
        System.out.println(this.name + " ceiling fan is low.");
    }

    public void off() {
        this.speed = OFF;
        System.out.println(this.name + " ceiling fan is off.");
    }

    public CeilingFan(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this.name + " ceiling fan is on.");
    }
}
