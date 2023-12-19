package day11.task2;

public abstract class Hero {
    protected double health;
    protected double physDef;
    protected int physAtt;
    protected double magicDef;
    protected int magicAtt;  

    public Hero() {
        health = 100.0d;
    }

    public abstract String toString();
}
