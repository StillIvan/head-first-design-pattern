package com.github.oycharming.pattern.command.undo;

/**
 * 音响.
 * @author Charming
 * @since 2016-09-05 10:39
 */
public class Stereo {
    private String name = "The";

    public Stereo() {
    }

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this.name + " stereo is on.");
    }

    public void off() {
        System.out.println(this.name + " stereo is off.");
    }

    public void setCD() {
        System.out.println(this.name + " stereo is set for CD input.");
    }

    public void setVolume(int volume) {
        System.out.println(this.name + " stereo volume set to " + volume + " .");
    }
}
