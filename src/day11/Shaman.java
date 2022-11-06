package day11;

public class Shaman extends Hero implements  Healer, MagicAttack{

    public static final int HEALHIMSELF = 50;
    private int magicAtt;

    public Shaman(){
        this.setHealth(MAX_HEALTH);
        this.magicAtt = 15;
        this.setPhysDef(0.2);
        this.setMagicDef(0.2);
        this.setPhysAtt(10);
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

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.getHealth() > MIN_HEALTH) {
            if (hero.getHealth() < (magicAtt - (magicAtt * hero.getMagicDef()))) {
                hero.setHealth(MIN_HEALTH);
            } else {
                hero.setHealth((int) (hero.getHealth() - (magicAtt - (magicAtt * hero.getMagicDef()))));
            }
        }
    }


    public String toString(){
        return "Shaman(health=" + getHealth() + ")";
    }
}
