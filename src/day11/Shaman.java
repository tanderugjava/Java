package day11;

public class Shaman extends Hero implements  Healer, PhysAttack, MagicAttack{
    int physAtt;
    int magicAtt;

    public Shaman(){
        health = 100;
        this.magicAtt = 15;
        physDef = 0.2;
        magicDef = 0.2;
        this.physAtt = 10;
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
            hero.health += 50;
            if(hero.health > 100){
                hero.health = 100;
            }
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
        if(hero.health > 0){
            hero.health = (int) (hero.health - (magicAtt - (magicAtt * hero.magicDef)));
            if(hero.health < 0){
                hero.health = 0;
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
        return "Shaman(health=" + health + ")";
    }
}
