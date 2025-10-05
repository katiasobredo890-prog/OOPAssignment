package gymquest.Game;
import gymquest.Characters.Hero;
import gymquest.Characters.Monster;

import java.util.Scanner; // Importerar Scanner

    public class GameHelper {
    private Scanner scanner;

    public GameHelper() { // Konstruktor som skapar scanner för att läsa in användarens val
        this.scanner = new Scanner(System.in);
    }
    // SCANNER
    public String readInput() { // Inläsaren
        System.out.println("Name your hero: ");
        return scanner.nextLine();
    }
    public int readInt() {
        System.out.println();
        int value = scanner.nextInt();
        scanner.nextLine(); // Radbrytningen SKA DEN TAS BORT?
        return value;
    }
        public void close() {
        scanner.close();
    }
        // FIGHT LOOP
    public boolean fight(Hero hero, Monster monster) { // Sant/falskt loop för om monster finns eller ej
        if (monster == null) { // Ingen fight
            System.out.println("Today was leg-day and you had a good workout!");
            return false; // Ingen fight, ingen vinst
        }
        while (hero.isAlive() && monster.isAlive()) { // Monster finns, hero attackerar först
            int heroDmg = hero.attack(); // Hjälten slår först
            monster.takeDamage(heroDmg);
            System.out.println("You used " + hero.getWeapon().getName() + " and got a few more reps!"); // hämtar vapnets namn och skriver ut
            if (!monster.isAlive()) {// Om monster ("!" = false)  is alive, monstret dog
                hero.addXp(monster.getXpReward()); // Belöning
            return true; }
            int monDmg = monster.attack(); // Monster slår
            System.out.println("Set 1: You're overtraining! Take it easy or you'll burn out!");
            hero.takeDamage(monDmg);
        }// 3. Avgör vinnare
        if (hero.isAlive()) {
            System.out.println("Set 2: You got the bar up, PR!");
            hero.addXp(monster.getXpReward()); // Fåt xp reward som sedan kan göras om till GOLD REWARD
            return true;
        } else {
            System.out.println("You survived your workout and got " + hero.getHp() + " focus, and " + hero.getXp() + " motivation!");
            return false;
        }
    }
}


