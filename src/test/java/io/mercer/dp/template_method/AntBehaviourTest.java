package io.mercer.dp.template_method;

import org.junit.Test;

import static org.junit.Assert.*;

public class AntBehaviourTest {

    @Test
    public void testFindFood() throws Exception {
        AntBehaviour antBehaviour = new AntBehaviourImpl();

        antBehaviour.findFood();
    }
}