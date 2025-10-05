package gymquest.Characters;

import gymquest.Items.Weapon;

public class Hero extends Character {

    private int maxHp; // Instansvariabler privata för dom gäller endast hero
    private int xp;
    private int level;
    private Weapon weapon; // FÖRKLARA

    public Hero(String name) {
        super(name, 100, 30); // Konstruktor, anropar föräldrar-klassen (Character)
        this.maxHp = 100; // Startvärden för hero
        this.xp = 0;
        this.level = 1;
        this.weapon = new Weapon("belt", 20); // FÖRKLARA OCH FÖRSTÅ HUR WEAPON FUNGERAR I PARAMETERN

    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getMaxHp() {  // Öka maxHp med 20
        return maxHp;
    }

    public int getXp() {
        return xp;
    }
    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getLevel() {
        return level;
    }

    public void addXp(int amount) { // Metod som ger hjälten XP och level up varje gång xp når 100
        if (level >= 10) return; // Om level är > 10 avbryts metoden
        this.xp += amount; // Lägg till Xp

        if (this.xp >= 100) {
            this.xp -= 100; // Tar bort 100 xp vid level up
            levelUp();
        }
    }

    private void levelUp() { // intern metod som höjer level, ökar maxHp och återställer hp
        level++;
        maxHp += 30; // Ökar maxhp FÖRKLARING
        setHp(maxHp);
        System.out.println("Level up! You are now level " + getLevel() + ", maxFocus is now " + maxHp + "!");
    }

    // SKRIV UT WEAPON DAMAGE
    public void heroInfo() {
        System.out.println("Hero info:");
        System.out.println("Level: " + getLevel());
        System.out.println("Motivation: " + xp);
        System.out.println("Focus: " + getHp());
        System.out.println("Max focus: " + maxHp);
    }

    public void equip(Weapon weapon) { // FÖRKLARA
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }


    @Override
    public int attack() { // Ersätter characters metod attack
        int base = getDamage(); // Hämtar hjältens grundskada från superklassen
        int w = 0; // Vapen skada
        if (weapon != null) { // Om hjälten inte har "null", alltså har ett vapen
            w = weapon.getDamage(); // Hämtar och reassignar värdet till vapnets damage
        }
        return base + w; // Total skada returneras
    }

    public String getLevelTitle() {
        switch (level) { // Switch sats som skriver ut olika namn på varje level
            case 1:
                return "Neewbie";
            case 2:
                return "Beginner";
            case 3:
                return "Rookie";
            case 4:
                return "Gym-bro";
            case 5:
                return "Fitness influencer";
            case 6:
                return "Body-builder";
            case 7:
                return "Power-lifter";
            case 8:
                return "Athlete";
            case 9:
                return "Super-athlete";
            case 10:
                return "LEGEND";
            default:
                return "unknown level";
        }
    }
}







