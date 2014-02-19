package io.mercer.dp.command;

public interface Command {
    void execute();

    void undo();
}
