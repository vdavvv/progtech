package rpg;

public class Hero extends Character {
   private float defense;

    public Hero(String name, int health, int power, float defense) {
        super(name, health, power);
        this.defense = defense;
    }

    @Override
    public void takeDamage(int damage) {
        damage /= this.defense;
        super.takeDamage(damage);
    }
}
