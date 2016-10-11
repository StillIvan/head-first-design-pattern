package com.github.oycharming.pattern.command.party;

import com.github.oycharming.pattern.command.remote.Command;

/**
 * 多个命令一起执行
 * @author Charming
 * @since 2016-09-05 23:37
 */
public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }
}
