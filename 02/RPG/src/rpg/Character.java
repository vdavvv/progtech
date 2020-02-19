package rpg;

public abstract class Character {

    private String name;
    private int health;
    private int power;

    public Character(String name, int health, int power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    public void attack(Character enemy){
        enemy.takeDamage(this.power);
    }

    public void takeDamage(int damage){
        this.health-=damage;
    }

    public boolean isAlive(){
        return  health >= 0;
    }
}
