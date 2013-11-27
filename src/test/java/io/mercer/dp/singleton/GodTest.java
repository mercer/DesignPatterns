package io.mercer.dp.singleton;

import org.junit.Test;

public class GodTest {

    @Test
    public void testCreateWorld() throws Exception {
        God.INSTANCE.createWorld();
    }
}
