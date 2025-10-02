package gymquest;

import java.util.Scanner;

public class Hero extends Character {

    private int maxHp; // Instansvariabler privata för dom gäller endast heroe
    private int xp;
    private int level;

    public Hero(String name) {
        super(name, 100, 10); // Anropar föräldrarklassens (Character) konstruktor

        this.maxHp = 100; // Startvärden för heroe
        this.xp = 0;
        this.level = 1;

    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getLevel() {
        return level;
    }

    public void addXp(int amount) { // Metod som ger hjälten XP och level up varje gång xp når 100
        if (level >= 10)
            return; // Om spelet är vunnet ska det inte fortsättas läggas till xp
        this.xp += amount; // Lägg till Xp

        if (this.xp >= 100) {
            this.xp -= 100;
            levelUp();
        }

    }

    private void levelUp() {
        level++; // Höj level
    }

    public int getmaxHp() {  // Öka maxhp med 20
        setHp(getmaxHp());
        System.out.println("Level up! You are now level " + level + ", maxHp is now " + getmaxHp() + ", and HP is restored!");

        return 0;
    }

}



