package io.mercer.dp.flyweight;

import com.google.common.collect.Maps;

import java.util.Map;

public class MonsterFactory {
    private Map<String, Monster> monsters = Maps.newHashMap();

    public Monster getMonster(String vocalization) {
        Monster monster = monsters.get(vocalization);
        if (monster == null) {
            monster = new Monster(vocalization);
            monsters.put(vocalization, monster);
        }
        return monster;
    }
}
