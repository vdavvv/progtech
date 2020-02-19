package rpg;

public abstract class Dragon extends Character {
    private int damageTreshold;

    public Dragon(String name, int health, int power, int damageTreshold) {
        super(name, health, power);
        this.damageTreshold = damageTreshold;
    }

    @Override
    public void takeDamage(int damage){
        if(damage > damageTreshold){
            super.takeDamage(damage);
        }
    }
}
