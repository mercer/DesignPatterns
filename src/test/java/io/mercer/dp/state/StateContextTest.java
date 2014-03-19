package io.mercer.dp.state;

import org.junit.Test;

public class StateContextTest {
    @Test
    public void testWriteName() throws Exception {
        StateContext sc = new StateContext();
        sc.writeName("Monday");
        sc.writeName("Tuesday");
        sc.writeName("Wednesday");
        sc.writeName("Thursday");
        sc.writeName("Friday");
        sc.writeName("Saturday");
        sc.writeName("Sunday");
    }
}
