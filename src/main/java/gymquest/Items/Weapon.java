package gymquest.Items;

public class Weapon {
    private String name;
    private int damage; // VADÅ FINAL

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
    public String getName() {
        return name;
    }
    public int getDamage() {
        return damage;
    }
    @Override // Behöver inte anropa med lång kod utan med metoden
    public String toString() { // Gör override på javas automatiska klass object för att ej få ful utskrift eftersom jag skriver ut ett helt objekt (Weapon)
        return name + " (+" + damage + "dmg)";
    }
}