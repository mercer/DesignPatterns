package io.mercer.dp.template_method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class AntBehaviour {
    private static final Logger LOG = LogManager.getLogger(AntBehaviour.class);

    public final void findFood() {
        exitColony();
        goInCircles();
        returnWithFood();
    }

    protected void returnWithFood() {
        LOG.debug("returning with food ...");
    }

    protected abstract void goInCircles();

    protected abstract void exitColony();
}
