package day11;

public class Paladin extends Hero implements  Healer, PhysAttack{

    public static final int HEALHIMSELF = 25;

    public Paladin (){
        this.setHealth(MAX_HEALTH);
        this.setPhysDef(0.5);
        this.setPhysAtt(15);
        this.setMagicDef(0.2);
    }

    @Override
    public void healHimself() {
        if(getHealth() < MAX_HEALTH) {
            setHealth(getHealth() + HEALHIMSELF);
        }
        else{
            setHealth(MAX_HEALTH);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if(getHealth() < MAX_HEALTH) {
            hero.setHealth(getHealth() + HEALHIMSELF);
        }
        else{
            hero.setHealth(MAX_HEALTH);
        }
    }


    public String toString(){
        return "Paladin(health=" + getHealth() + ")";
    }
}
