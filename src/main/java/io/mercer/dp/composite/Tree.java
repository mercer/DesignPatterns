package io.mercer.dp.composite;

import com.google.common.collect.Lists;

import java.util.List;

public class Tree implements Item {
    private List<Item> branches = Lists.newArrayList();

    public void add(Item item) {
        branches.add(item);
    }

    @Override
    public void print() {
        for (Item item : branches) {
            item.print();
            System.out.println("\t\t\t\ton a tree");
        }
    }
}
