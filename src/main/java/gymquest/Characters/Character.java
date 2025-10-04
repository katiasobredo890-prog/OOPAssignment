package gymquest.Characters;

public abstract class Character {
    private String name; // Variabler som lagrar data för varje Character underklass
    private int hp;
    private int damage;

    public Character(String name, int hp, int damage) { // Konstruktor med inkapsling (egenskaper är privata)
        this.name = name;
        this.hp = hp;
        this.damage = damage;

    }
    public String getName() { // Getters och setters
        return name;
    }
    public void setName(String name) {
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
    public void setDamage(int damage) { // VAR ANVÄNDAS SETDAMAGE
        this.damage = damage;
    }

    public boolean isAlive() { // SKA DENNA LOOP GÖRAS
        return hp > 0;
    }
    public abstract int attack(); // Abstrakt metod jämfört med ovanstående
}

