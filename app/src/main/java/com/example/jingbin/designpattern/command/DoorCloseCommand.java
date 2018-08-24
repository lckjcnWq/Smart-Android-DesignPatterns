package com.example.jingbin.designpattern.command;

/**
 * 关门的命令
 */

public class DoorCloseCommand implements Command {

    private Door door;

    public DoorCloseCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.close();
    }
}
