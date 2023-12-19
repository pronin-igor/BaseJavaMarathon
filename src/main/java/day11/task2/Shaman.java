package day11.task2;

import day11.task2.interfaces.Healer;
import day11.task2.interfaces.MagicAttack;
import day11.task2.interfaces.PhysAttack;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer{

    public Shaman() {
        physDef = 0.2;
        physAtt = 10;
        magicDef = 0.2;
        magicAtt = 15;
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

    public void healHimself() {
        health += 50;
    }

    public void healTeammate(Hero hero) {
        hero.health += 30;
    }

    public String toString() {
        return "Shaman{health=" + health + "}";
    }
}
