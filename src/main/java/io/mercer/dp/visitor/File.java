package io.mercer.dp.visitor;

import java.util.ArrayList;
import java.util.List;

public class File implements Item {

    private String name;
    private boolean directory = false;
    private List<File> children = new ArrayList<File>();
    private int level = 0;

    public File (String name, boolean isDirectory) {
        this.name = name;
        this.directory = isDirectory;
    }

    public void addChild(File file) {
        this.children.add(file);
        file.incrementLevel();
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void incrementLevel() {
        this.level++;
        for (File file : children) {
            file.incrementLevel();
        }
    }

    public boolean isDirectory() {
        return directory;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (File file : children) {
            file.accept(visitor);
        }
    }
}
