package io.mercer.dp.chainofresponsability;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Welder extends Machine {
    private static final Logger LOG = LogManager.getLogger(Welder.class);
    @Override
    public Machine next() {
        return null;
    }

    @Override
    public void process(Job job) {
        if (job == Job.WELD) {
            LOG.debug("welding");
        }
        if (next != null) {
            next.process(job);
        }

    }
}
