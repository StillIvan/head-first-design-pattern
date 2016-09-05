package com.github.stillivan.pattern.command.undo;

/**
 * @author Charming
 * @since 2016-09-04 23:27
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
