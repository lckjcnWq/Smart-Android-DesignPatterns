package com.example.jingbin.designpattern.command;

/**
 * 打开电脑的命令
 */

public class ComputerOnCommand implements Command {

    private Computer computer;

    public ComputerOnCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.on();
    }
}
