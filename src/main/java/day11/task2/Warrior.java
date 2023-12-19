package day11.task2;

import day11.task2.interfaces.PhysAttack;

public class Warrior extends Hero implements PhysAttack {

    public Warrior() {
        physDef = 0.8;
        physAtt = 30;
        magicDef = 0;
        magicAtt = 0;
    }

    public void physicalAttack(Hero hero) {
        hero.health = hero.health - physAtt * (1 - hero.physDef);
        if (hero.health < 0) {
            hero.health = 0;
        }
    }

    public String toString() {
        return "Warrior{health="+health+"}";
    }
}
