package day11;

public class Magician extends Hero implements PhysAttack, MagicAttack{
    int magicAtt;
    int physAtt;

    public Magician(){
        health = 100;
        physDef = 0;
        this.magicAtt = 20;
        magicDef = 0.8;
        this.physAtt = 5;
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
        return "Magician(health=" + health + ")";
    }
}
