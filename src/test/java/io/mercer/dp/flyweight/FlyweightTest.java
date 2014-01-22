package io.mercer.dp.flyweight;

import com.google.common.collect.Lists;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.List;

public class FlyweightTest {
    private static final Logger LOG = LogManager.getLogger(FlyweightTest.class);

    @Test
    public void monsterBrawl() throws Exception {
        MonsterFactory factory = new MonsterFactory();
        List<Monster> monsters = Lists.newArrayList();

        monsters.add(factory.getMonster("roar"));
        monsters.add(factory.getMonster("roar"));
        monsters.add(factory.getMonster("bawl"));
        monsters.add(factory.getMonster("holler"));
        monsters.add(factory.getMonster("roar"));
        monsters.add(factory.getMonster("squawk"));
        monsters.add(factory.getMonster("squawk"));
        monsters.add(factory.getMonster("wham"));
        monsters.add(factory.getMonster("bark"));
        monsters.add(factory.getMonster("growl"));
        monsters.add(factory.getMonster("grunt"));
        monsters.add(factory.getMonster("grunt"));
        monsters.add(factory.getMonster("snarl"));
        monsters.add(factory.getMonster("snarl"));
        monsters.add(factory.getMonster("snarl"));
        monsters.add(factory.getMonster("snarl"));
        monsters.add(factory.getMonster("snap"));
        monsters.add(factory.getMonster("woof"));
        monsters.add(factory.getMonster("snap"));

        for (Monster monster : monsters) {
            LOG.debug(monster.vocalize());
        }
    }
}
