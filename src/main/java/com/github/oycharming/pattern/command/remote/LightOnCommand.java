package com.github.oycharming.pattern.command.remote;

import com.github.oycharming.pattern.command.remote.Command;

/**
 * @author Charming
 * @since 2016-09-04 23:27
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
