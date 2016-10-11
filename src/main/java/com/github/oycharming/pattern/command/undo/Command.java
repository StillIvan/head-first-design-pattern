package com.github.oycharming.pattern.command.undo;

/**
 * 增加撤销的功能.
 * @author Charming
 * @since 2016-09-04 23:26
 */
public interface Command {
    void execute();

    void undo();
}
