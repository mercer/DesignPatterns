package io.mercer.dp.composite;

import com.google.common.collect.Lists;

import java.util.List;

public class Branch implements Item {
    List<Item> leafs = Lists.newArrayList();

    public void add(Leaf leaf) {
        leafs.add(leaf);
    }

    @Override
    public void print() {
        for (Item item : leafs) {
            item.print();
            System.out.println("\t\ton a branch");
        }
    }
}
