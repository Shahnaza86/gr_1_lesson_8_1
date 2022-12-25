package kg.geektech.game.playes;

public class Berserk extends Hero {
    private int savedDamage;
    public int getSavedDamage() {
        return savedDamage;
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }


    public Berserk(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (boss.getDamage() >= this.getDamage()) {
            boss.setHealth(boss.getHealth() - this.getDamage() + (savedDamage - 20));
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }
}


    }

