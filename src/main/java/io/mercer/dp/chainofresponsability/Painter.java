package io.mercer.dp.chainofresponsability;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Painter extends Machine {
    private static final Logger LOG = LogManager.getLogger(Machine.class);

    @Override
    public Machine next() {
        return null;
    }

    @Override
    public void process(Job job) {
        if (job == Job.PAINT) {
            LOG.debug("painting");
        }
        if (next != null) {
            next.process(job);
        }
    }
}
