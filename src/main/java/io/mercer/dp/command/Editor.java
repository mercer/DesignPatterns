package io.mercer.dp.command;

import java.util.ArrayList;
import java.util.List;

public class Editor {
    private List<Command> history = new ArrayList<Command>();

    public void storeAndExecute(Command cmd) {
        this.history.add(cmd);
        cmd.execute();
    }

    public void undo() {
        Command lastCommand = history.get(history.size() - 1);
        lastCommand.undo();
        history.remove(history.size() - 1);
    }
}
