package gymquest.Characters;

public abstract class Character {
    private String name; // Variabler som lagrar data för varje Character underklass, inkapsling
    private int hp;
    private int damage;

    public Character(String name, int hp, int damage) { // Konstruktor med inkapsling (egenskaper är privata för att ej kunna ändras utifrrån)
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public String getName() { // Getters hämtar/returnerar värden. Setters sätter dom nya
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

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public abstract int attack(); // Abstrakt metod jämfört med ovanstående, tvingar underklasser att skapa egen attack

    public void takeDamage(int dmg) { // ej abstrakt eftersom alla klasser tar skada på samma sätt
        hp = Math.max(0, hp - dmg); // Sänk hp men aldrig under noll
    }
}


