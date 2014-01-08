package io.mercer.dp.composite;

import org.junit.Test;

public class ClientTest {
    @Test
    public void aLeafPrint() throws Exception {
        Leaf leaf = new Leaf();
        leaf.print();
    }

    @Test
    public void aBranchPrint() throws Exception {
        Leaf leaf = new Leaf();
        Branch branch = new Branch();

        branch.add(leaf);
        branch.add(leaf);
        branch.add(leaf);

        branch.print();
    }

    @Test
    public void aTreePrint() throws Exception {
        Leaf leaf = new Leaf();
        Branch branch = new Branch();
        Tree tree = new Tree();

        branch.add(leaf);
        branch.add(leaf);
        branch.add(leaf);

        tree.add(branch);
        tree.add(branch);

        tree.print();
    }
}
