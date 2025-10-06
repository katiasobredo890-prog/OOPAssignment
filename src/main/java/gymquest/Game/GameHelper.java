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
        scanner.nextLine(); // Radbrytning
        return value;
    }
        public void close() {
        scanner.close();
    }
        // FIGHT LOOP
    public boolean fight(Hero hero, Monster monster) { // Sant/falskt loop för om monster finns eller ej
        if (monster == null) { // Ingen fight
            return false; // Ingen fight, ingen vinst
        }
        while (hero.isAlive() && monster.isAlive()) { // Monster finns, hero attackerar först
            System.out.println("You ego-lifted and pulled a muscle! \uD83D\uDE35");
            int heroDmg = hero.attack(); // Hjälten slår först
            monster.takeDamage(heroDmg);
            System.out.println("You used " + hero.getWeapon().getName() + " and got a few more reps! \uD83C\uDFCB\uFE0F\u200D♀\uFE0F"); // hämtar vapnets namn och skriver ut
            if (!monster.isAlive()) {// Om monster ("!" = false)  is alive, monstret dog
                hero.addXp(monster.getXpReward()); // Belöning
                System.out.println("You have: " + hero.getHp() + " focus and " + hero.getXp() + " motivation!");
            return true; } // Gå tillbaka till meny
            int monDmg = monster.attack(); // Monster slår
            System.out.println("‼\uFE0F You're overtraining! Take it easy or you'll burn out! ‼\uFE0F ");
            hero.takeDamage(monDmg);
            System.out.println("You have: " + hero.getHp() + " focus and " + hero.getXp() + " motivation!");
        }// 3. Avgör vinnare
        if (hero.isAlive()) {
            System.out.println("You got the bar up and made a PR! \uD83D\uDD25");
            hero.addXp(monster.getXpReward()); // Får xp reward som sedan kan göras om till GOLD REWARD
            System.out.println("You have " + hero.getHp() + " focus, and " + hero.getXp() + " motivation!");
            return true;
        } else {
            System.out.println("☠\uFE0F You lost all focus and collapsed! ☠\uFE0F");
            System.exit(0);
            return false;
        }
    }
}


