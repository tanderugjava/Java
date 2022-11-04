package day11;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    private int magicAtt;

    public Magician() {
        this.setHealth(100);
        this.setPhysDef(0);
        this.magicAtt = 20;
        this.setMagicDef(0.8);
        this.setPhysAtt(5);
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


        public String toString () {
            return "Magician(health=" + getHealth() + ")";
        }
}
