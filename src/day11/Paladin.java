package day11;

public class Paladin extends Hero implements  Healer, PhysAttack{
    int physAtt;

    public Paladin (){
        health = 100;
        physDef = 0.5;
        this.physAtt = 15;
        magicDef = 0.2;
    }

    @Override
    public void healHimself() {
        if(health < 100){
            health += 25;
            if(health > 100){
                health = 100;
            }
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if(hero.health < 100){
            hero.health += 10;
            if(hero.health > 100){
                hero.health = 100;
            }
        }
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
        return "Paladin(health=" + health + ")";
    }
}
