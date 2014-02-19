package io.mercer.dp.strategy;

public class Witness {
    private ConfessionPolicy confessionPolicy;

    public Witness(ConfessionPolicy confessionPolicy) {
        this.confessionPolicy = confessionPolicy;
    }

    public void confess() {
        confessionPolicy.confess();
    }
}
