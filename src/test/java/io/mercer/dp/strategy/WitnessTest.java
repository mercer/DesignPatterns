package io.mercer.dp.strategy;

import org.junit.Test;

public class WitnessTest {
    @Test
    public void witnessTellsTheTruth() throws Exception {
        Witness witness = new Witness(new TruthPolicy());

        witness.confess();
    }

    @Test
    public void witnessLies() throws Exception {
        Witness witness = new Witness(new LiePolicy());

        witness.confess();
    }
}
