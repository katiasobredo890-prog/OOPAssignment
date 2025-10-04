package gymquest.Items;

public class Weapon {
    private String name;
    private int damage;

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
    public void setName(String name) {
        this.name = Bicep;
    }
    public int attack() {
        System.out.println("You go to the benchpress ");
    }
}
