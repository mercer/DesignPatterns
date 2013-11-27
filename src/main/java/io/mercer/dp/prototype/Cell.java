package io.mercer.dp.prototype;

public class Cell implements Cloneable {
    private String name = "cell";

    public Cell multiply() throws CloneNotSupportedException {
        Cell clone = (Cell) super.clone();
        clone.name += "+";
        return clone;
    }

    @Override
    public String toString() {
        return name;
    }
}
