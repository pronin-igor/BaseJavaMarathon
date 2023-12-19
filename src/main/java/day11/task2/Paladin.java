package day11.task2;

import day11.task2.interfaces.Healer;
import day11.task2.interfaces.PhysAttack;

public class Paladin extends Hero implements PhysAttack, Healer{

    public Paladin() {
        physDef = 0.5;
        physAtt = 15;
        magicDef = 0.2;
        magicAtt = 0;
    }

    public void physicalAttack(Hero hero) {
        hero.health = hero.health - physAtt * (1 - hero.physDef);
        if (hero.health < 0) {
            hero.health = 0;
        }
    }

    public void healHimself() {
        health += 25;
    }

    public void healTeammate(Hero hero) {
        hero.health += 10;
    }

    public String toString() {
        return "Paladin{health=" + health + "}";
    }
}
