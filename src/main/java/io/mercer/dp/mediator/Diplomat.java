package io.mercer.dp.mediator;

import java.util.ArrayList;
import java.util.List;

public class Diplomat {
    private List<Party> parties = new ArrayList<Party>();

    public void register(Party party) {
        parties.add(party);
    }

    public void notify(EventType eventType) {
        switch (eventType) {
            case BECOMES_BELLIGERENT:
                notifyParties(EventType.BETTER_PREPARE);
            default:

        }
    }

    private void notifyParties(EventType eventType) {
        for (Party party : parties) {
            party.notify(eventType);
        }
    }
}
