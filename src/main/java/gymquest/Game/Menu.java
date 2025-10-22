package gymquest.Game;

import gymquest.Characters.Hero;
import gymquest.Game.Encounter;
import gymquest.Characters.Monster;
import gymquest.Characters.Boss;

public class Menu {
    private GameHelper reader;
    private Hero hero;
    private Encounter encounter = new Encounter();
    private boolean gameIsRunning = true; // Deklarerar och initierar (skapar och sätter värde på)  boolean variabel för gameisrunning

    public Menu(GameHelper reader, Hero hero) { // konstruktor
        this.reader = reader;
        this.hero = hero;

    }
    public void showMenu() { // Alternativ för meny
        System.out.println("\n=== Menu ==="); // Lämnar en rad
        System.out.println("[1] Quest");
        System.out.println("[2] Hero Info");
        System.out.println("[3] Exit");
    }
    public void start() throws InterruptedException {
        System.out.println("=== Welcome to GymQuest ===");
        while (gameIsRunning) { // While loop som kör alternativen tills användaren väljer exit
            showMenu();
            int choice = reader.readInt();
            if (choice == 1) {
                System.out.println("You go to the gym to get some gains! \uD83D\uDCAA");
                Monster monster = encounter.generateEncounter(); // Skapar möte med monster
                if (monster != null) { // Om monster inte är null, alltså finns
                    boolean heroWon = reader.fight(hero, monster); // Skapa ny variabel (herowon) och spara resultatet från metoden fight
                    if (heroWon) {
                        gameIsRunning = true; // Spelet fortsätter köra om hjälten vann
                    }
                    if (hero.getLevel() >= 10) { // Stoppar spelet vid level 10
                        gameIsRunning = false;
                    }
                }
            } else if (choice == 2) { // Skriver ut info om hjälten om användaren väljer 2
                hero.heroInfo();
            } else {

                System.out.println("Exiting Game, Bye!");
                gameIsRunning = false;

            }
        }
    }
}





