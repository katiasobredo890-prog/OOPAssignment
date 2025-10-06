package gymquest.Characters;

import gymquest.Items.Weapon;

import javax.swing.*;

public class Hero extends Character {

    private int maxHp; // Instansvariabler privata
    private int xp;
    private int level;
    private Weapon weapon;

    public Hero(String name) { // Startvärden för hero
        super(name, 100, 30); // Konstruktor, anropar föräldrar-klassen (Character), sätter värden
        this.maxHp = 100;
        this.xp = 0;
        this.level = 1;
        this.weapon = new Weapon("belt", 20);

    }

    public int getXp() {
        return xp;

    }

    public int getLevel() {
        return level;

    }

    public void addXp(int amount) { // Metod som ger hjälten XP och level up varje gång xp når 100
        if (level >= 10) return; // Om level är > 10 avbryts metoden
        this.xp += amount; // Lägg till Xp

        if (this.xp >= 100) {
            this.xp -= 100; // Tar bort 100 xp vid level up så det börjar om på noll
            levelUp();
        }
    }

    private void levelUp() { // intern metod som höjer level, ökar maxHp och återställer hp
        level++;
        maxHp += 30; // Ökar maxhp
        setHp(maxHp);
        System.out.println(" \uD83C\uDFC6 Level up! You are now level " + getLevelTitle() + ", maxFocus is now " + maxHp + "!");
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
        int w = 0; // Gör så vapnet bara får +0 i skada om hjälten inte har ett vapen
        if (weapon != null) {
            w = weapon.getDamage(); // Hämtar och reassign värdet till vapnets damage
        }
        return base + w; // Total skada returneras
    }

    public String getLevelTitle() {
        switch (level) { // Switch sats som skriver ut olika namn på varje level som kommer användas i menyn
            case 1:
                return "1: Neewbie";
            case 2:
                return "2: Beginner";
            case 3:
                return "3: Rookie";
            case 4:
                return "4: Gym-bro";
            case 5:
                return "5: Fitness influencer";
            case 6:
                return "6: Body-builder";
            case 7:
                return "7: Power-lifter";
            case 8:
                return "8: Athlete";
            case 9:
                return "9: Super-athlete";
            case 10:
                return "10: LEGEND! YOU WON THE GAME";
            default:
                return "unknown level";
        }
    }
}







