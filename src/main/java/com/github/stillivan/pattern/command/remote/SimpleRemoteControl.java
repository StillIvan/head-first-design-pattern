package com.github.stillivan.pattern.command.remote;

/**
 * 简单远程控制器.
 * @author Charming
 * @since 2016-09-04 23:28
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    /**
     * 按钮按下时候，执行什么命令.
     */
    public void buttonWasPressed() {
        slot.execute();
    }
}
