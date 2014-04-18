package io.mercer.dp.mediator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Party {
    private static final Logger LOG = LogManager.getLogger(Party.class);
    public String name;
    private Diplomat diplomat;

    public Party(String name, Diplomat diplomat) {
        this.name = name;
        this.diplomat = diplomat;
        diplomat.register(this);
    }

    public void trigger(EventType eventType) {
        LOG.debug("[" + name +"] " + eventType);
        diplomat.notify(eventType);
    }

    public void notify(EventType eventType) {
        switch (eventType) {
            case BETTER_PREPARE:
               LOG.debug("[" + name +"] OMG!");
        }
    }
}
