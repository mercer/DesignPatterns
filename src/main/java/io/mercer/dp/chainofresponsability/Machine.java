package io.mercer.dp.chainofresponsability;

public abstract class Machine {
    protected Machine next;
    public abstract Machine next();
    public abstract void process(Job job);
    public void setNext(Machine next) {
        this.next = next;
    }
}
