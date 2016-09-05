package com.github.stillivan.pattern.command.remote;

/**
 * @author Charming
 * @since 2016-09-05 10:36
 */
public class CeilingFan {
    String name = "The";

    public CeilingFan() {
    }

    public CeilingFan(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this.name + " ceiling fan is on.");
    }

    public void off() {
        System.out.println(this.name + " ceiling fan is off.");
    }
}
