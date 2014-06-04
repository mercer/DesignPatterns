package io.mercer.dp.template_method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AntBehaviourImpl extends AntBehaviour {
    private static final Logger LOG = LogManager.getLogger(AntBehaviourImpl.class);
    @Override
    protected void goInCircles() {
        LOG.debug("circling ...");
    }

    @Override
    protected void exitColony() {
        LOG.debug("exiting colony ...");
    }

    @Override
    protected void returnWithFood() {
        LOG.debug("returning quickly with food ...");
    }
}
