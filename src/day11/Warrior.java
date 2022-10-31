package day11;

public class Warrior extends Hero implements PhysAttack {

    int physAtt;

    public Warrior(){
        health = 100;
        physDef = 0.8;
        magicDef = 0;
        this.physAtt = 30;
    }

    @Override
    public void physicalAttack(Hero hero) {
        if(hero.health > 0){
            hero.health = (int) (hero.health - (physAtt - (physAtt * hero.physDef)));
            if(hero.health < 0){
                hero.health = 0;
            }
        }
    }

    public String toString(){
        return "Warrior(health=" + health + ")";
    }
}
