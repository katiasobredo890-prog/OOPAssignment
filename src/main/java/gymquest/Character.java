package gymquest;

public abstract class Character {

    public abstract String name(); // Metoddeklaration, här ska användaren få välja med scanner
    public abstract int hp();
    public abstract int damage();
    public abstract int takeDamage(int amount); //
    public abstract boolean isAlive (); // Boolean för tue/false


}


