package io.mercer.dp.prototype;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PetriDish {
    private Map cellRegistry = Maps.newHashMap();
    private LinkedList<Cell> cells = Lists.newLinkedList();

    public void tick() throws CloneNotSupportedException {
        LinkedList<Cell> newCells = Lists.newLinkedList();
        for (Cell cell : cells) {
            newCells.addLast(cell.multiply());
        }
        cells.addAll(newCells);
    }

    public List<Cell> getCells() {
        return cells;
    }

    public void feed(Cell cell) {
        cells.addLast(cell);
    }
}
