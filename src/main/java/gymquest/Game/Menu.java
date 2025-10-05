package gymquest.Game;

import gymquest.Characters.Hero;
import gymquest.Game.Encounter;
import gymquest.Characters.Monster;
import gymquest.Characters.Boss;

public class Menu {
    private GameHelper reader;
    private Hero hero; // VARFÖR ORANGE
    private Encounter encounter = new Encounter();
    private boolean gameIsRunning = true; // VART ÄR DETTA KOPPLAT NU IGEN?

    public Menu(GameHelper reader, Hero hero) { // konstruktor
        this.reader = reader;
        this.hero = hero;

    }
    public void showMenu() {
        System.out.println("\n=== Menu ===");
        System.out.println("[1] Quest");
        System.out.println("[2] Hero Info");
        System.out.println("[3] Exit");
    }
    public void start() {
        System.out.println("=== Welcome to GymQuest ===");
        while (gameIsRunning) { // While loop som kör alternativen tills användaren väljer exit
            showMenu();
            int choice = reader.readInt();
            if (choice == 1) {
                System.out.println("You go to the gym to get some gains!");
                Monster monster = encounter.generateEncounter();
                if (monster != null) {
                    boolean heroWon = reader.fight(hero, monster); // FÖRKLARING
                    if (heroWon) {
                        gameIsRunning = true; // Spelet fortsätter köra
                    }
                }
            } else if (choice == 2) { // VARFÖR INLAND ELSE OCH IBLAND ELSE IF I OLIKA ORDNINGAR??
                hero.heroInfo();
            } else {

                System.out.println("Exiting Game, Bye!");
                gameIsRunning = false;

            }
        }
    }
}





