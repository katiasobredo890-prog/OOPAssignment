package gymquest.Game;

import gymquest.Characters.Hero;

public class Menu {
    private GameHelper reader;
    private Hero hero;
    private boolean gameIsRunning;

    public Menu(GameHelper reader, Hero hero) { // konstruktor
        this.reader = reader;
        this.hero = hero;
        this.gameIsRunning = true;
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
                System.out.println("You are going on quest, good luck!");
            } else if (choice == 2) {
                hero.heroInfo();
            } else {
                System.out.println("Exiting Game, Bye!");
                gameIsRunning = false;

            }
        }
    }
}





