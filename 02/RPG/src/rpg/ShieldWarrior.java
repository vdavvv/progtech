package rpg;

public class ShieldWarrior extends Orc{

    public ShieldWarrior(String name, int health, int power) {
        super(name, health, power);
    }

    @Override
    public void takeDamage(int damage){
        damage /= 2;
        super.takeDamage(damage);
    }
}
