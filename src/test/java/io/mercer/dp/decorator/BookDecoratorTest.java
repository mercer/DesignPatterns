package io.mercer.dp.decorator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class BookDecoratorTest {
    private static final Logger LOG = LogManager.getLogger(BookDecoratorTest.class);

    @Test
    public void testGetTraits() throws Exception {
        Book hardCover = new HardCover(new SimpleBook());
        hardCover.getTraits();

        Book leatherBound = new LeatherBound(new SimpleBook());
        LOG.info(leatherBound.getTraits());

        Book leatherBoundWithHardCover = new LeatherBound(new HardCover(new SimpleBook()));
        LOG.info(leatherBoundWithHardCover.getTraits());

        Book doubleHardCover = new HardCover(new HardCover(new SimpleBook()));
        LOG.info(doubleHardCover.getTraits());
    }
}
