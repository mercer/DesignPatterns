package io.mercer.dp.strategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LiePolicy implements ConfessionPolicy {
    private static final Logger LOG = LogManager.getLogger(LiePolicy.class);

    @Override
    public void confess() {
        LOG.debug("I'm lying");
    }
}
