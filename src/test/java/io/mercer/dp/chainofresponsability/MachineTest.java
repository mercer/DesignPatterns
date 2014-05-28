package io.mercer.dp.chainofresponsability;

import org.junit.Test;

import static org.junit.Assert.*;

public class MachineTest {

    @Test
    public void testProcess() throws Exception {
        Machine assemblyLine = new Welder();
        assemblyLine.setNext(new Painter());
        
        assemblyLine.process(Job.WELD);
        assemblyLine.process(Job.PAINT);
    }
}