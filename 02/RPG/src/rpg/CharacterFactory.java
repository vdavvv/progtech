package rpg;

import java.util.Random;

public class CharacterFactory {
    Random random = new Random();
    public Character generate(String type, String name){
        int health = random.nextInt(200);
        int power = random.nextInt(100);
        switch (type){
            case "Hero":
                float defense = random.nextFloat() * 10;
                return new Hero(name, health, power, defense);
            case "Berserker":
                return new Berserker(name, health, power);
            case "Warrior":
                return new Warrior(name, health, power);
            case "ShieldWarrior":
                return new ShieldWarrior(name, health, power);
            case "RedDragon":
                return new RedDragon(name, health, power);
            case "BlackDragon":
                return new BlackDragon(name, health, power);
            default:
                throw new IllegalArgumentException("No such character type");
        }
    }
}
