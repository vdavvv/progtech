package rpg;

public class Berserker extends Orc {
    public Berserker(String name, int health, int power) {
        super(name, health, power);
    }

    @Override
    public void takeDamage(int damage){
        damage *= 2;
        super.takeDamage(damage);
    }
}
