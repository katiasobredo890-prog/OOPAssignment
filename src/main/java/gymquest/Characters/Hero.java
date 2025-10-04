package gymquest.Characters;

public class Hero extends Character {

    private int maxHp; // Instansvariabler privata för dom gäller endast heroe
    private int xp;
    private int level;

    public Hero(String name) {
        super(name, 100, 10); // Konstruktor, anropar föräldrarklassen (Character)
        this.maxHp = 100; // Startvärden för heroe
        this.xp = 0;
        this.level = 1;

    }
    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }
    public int getMaxHp() {  // Öka maxHp med 20
        return maxHp;
    }
    public void setXp(int xp) {
        this.xp = xp;
    }
    public int getLevel() {
        return level;
    }

    public void addXp(int amount) { // Metod som ger hjälten XP och level up varje gång xp når 100
        if (level >= 10) return; // Om level är > 10 avbryts metoden GÖR LOOP SKICKA UT WINNNNNNNNNNNNN
        this.xp += amount; // Lägg till Xp

        if (this.xp >= 100) {
            this.xp -= 100; // Tar bort 100 xp vid level up
            levelUp();
        }
    }
    private void levelUp() { // intern metod som höjer level, ökar maxHp och återställer hp
        level++;
        maxHp += 20;
        setHp(maxHp);
        System.out.println("Level up! You are now level " + level + ", maxHp is now " + maxHp + ", and HP is restored!");
        }
    public void heroInfo() {
        System.out.println("Hero info:");
        System.out.println("Level: " + level);
        System.out.println("XP: " + xp);
        System.out.println("HP: " + getHp());
        System.out.println("Max HP: " + maxHp);
    }

    @Override // VAD SKA DETTA ANVÄNDAS TILL
    public int attack() {
        return getDamage();
    }
}



