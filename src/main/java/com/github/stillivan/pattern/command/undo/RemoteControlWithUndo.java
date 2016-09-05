package com.github.stillivan.pattern.command.undo;

/**
 * 遥控器有 14 个按钮，7 个插槽. 插槽对应打开按钮和关闭按钮.
 *
 * @author Charming
 * @since 2016-09-05 09:57
 */
public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControlWithUndo() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = new NoCommand();
    }

    /**
     * 为遥控器的不同插槽设置不同的指令.
     *
     * @param slot       插槽序号.
     * @param onCommand  打开命令
     * @param offCommand 关闭命令
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    /**
     * 打开按钮按下去时执行打开命令.
     *
     * @param slot 插槽序号
     */
    public void onButtonPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    /**
     * 关闭按钮按下去时执行关闭命令.
     *
     * @param slot 插槽序号
     */
    public void offButtonPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    /**
     * 撤销按钮按下，撤销上次的执行.
     */
    public void undoButtonPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n----- Remote Control -----\n");

        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "    " + offCommands[i].getClass().getName() + "\n");
        }

        return stringBuffer.toString();
    }
}
