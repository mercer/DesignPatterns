package io.mercer.dp.strategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TruthPolicy implements ConfessionPolicy {
    private static final Logger LOG = LogManager.getLogger(TruthPolicy.class);

    @Override
    public void confess() {
        LOG.debug("I'm telling the truth");
    }
}
