package day11.task2;

import day11.task2.interfaces.MagicAttack;
import day11.task2.interfaces.PhysAttack;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    public Magician() {
        physDef = 0;
        physAtt = 5;
        magicDef = 0.8;
        magicAtt = 20;
    }

    public void physicalAttack(Hero hero) {
        hero.health = hero.health - physAtt * (1 - hero.physDef);
        if (hero.health < 0) {
            hero.health = 0;
        }
    }

    public void magicalAttack(Hero hero) {
        hero.health = hero.health - magicAtt * (1 - hero.magicDef);
        if (hero.health < 0) {
            hero.health = 0;
        }
    }

    public String toString() {
        return "Magician{health=" + health + "}";
    }
}
