package io.mercer.dp.mediator;

import org.junit.Test;

public class DiplomatTest {

    @Test
    public void simulateInteractions() {
        Diplomat diplomat = new Diplomat();
        Party russia = new Party("russia", diplomat);
        Party usa = new Party("usa", diplomat);
        Party ukraine = new Party("ukraine", diplomat);

        russia.trigger(EventType.BECOMES_BELLIGERENT);


    }
}
