package day11;

public abstract class Hero {
    private int health;
    private double physDef;
    private double magicDef;
    private int physAtt;

    public static final int MAX_HEALTH = 100;
    public static final int MIN_HEALTH = 0;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getPhysDef() {
        return physDef;
    }

    public void setPhysDef(double physDef) {
        this.physDef = physDef;
    }
    public double getMagicDef() {
        return magicDef;
    }

    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    public void physicalAttack (Hero hero){
        if (hero.getHealth() > MIN_HEALTH) {
            if (hero.getHealth() < (getPhysAtt() - (getPhysAtt() * hero.getPhysDef()))) {
                hero.setHealth(MIN_HEALTH);
            } else {
                hero.setHealth((int) (hero.getHealth() - (getPhysAtt() - (getPhysAtt() * hero.getPhysDef()))));
            }
        }
    }
}
