package io.mercer.dp.prototype;

import com.google.common.collect.Lists;

import java.util.LinkedList;
import java.util.List;

public class PetriDish {
    private LinkedList<Cell> cells = Lists.newLinkedList();

    public void tick() throws CloneNotSupportedException {
        LinkedList<Cell> newCells = Lists.newLinkedList();
        for (Cell cell : cells) {
            newCells.add(cell.multiply());
        }
        cells.addAll(newCells);
    }

    public List<Cell> getCells() {
        return cells;
    }

    public void feed(Cell cell) {
        cells.add(cell);
    }
}
