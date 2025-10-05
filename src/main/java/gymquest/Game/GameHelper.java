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
        if (monster == null) { // 1. Ingen fight
            System.out.println("You had a GOOD workout!");
            return true; // Ingen fight
        }
        while (hero.isAlive() && monster.isAlive()) { // 2. Monster finns, hero attackerar först
            int heroDmg = hero.attack(); // Hjälten slår först
            monster.takeDamage(heroDmg);
            System.out.println("Monster hp: " + monster.getHp() + ")");
            if (!monster.isAlive()) // Om monster "!" (false)  is alive, monstret dog
                break;
            int monDmg = monster.attack(); // Monster slår
            hero.takeDamage(monDmg);
            System.out.println("Hero hp: " + hero.getHp());
        }// 3. Avgör vinnare
        if (hero.isAlive()) {
            System.out.println("You won!");
            hero.addXp(monster.getXpReward()); // Fåt xpreward som sedan kan göras om till GOLD REWARD
            return true;
        } else {
            System.out.println("You were defeated..");
            return false;
        }
    }
}


