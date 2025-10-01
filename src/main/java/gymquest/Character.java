package gymquest;

public abstract class Character {

    private String name; // Variabler som lagrar data för varje Character
    private int hp;
    private int damage;

    public String getName() { // Getters och setters
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

}

