package day11;

public class Warrior extends Hero implements PhysAttack {

    public Warrior(){
        this.setHealth(MAX_HEALTH);
        this.setPhysDef(0.8);
        this.setMagicDef(0);
        this.setPhysAtt(30);
    }

    public String toString(){
        return "Warrior(health=" + getHealth() + ")";
    }
}
