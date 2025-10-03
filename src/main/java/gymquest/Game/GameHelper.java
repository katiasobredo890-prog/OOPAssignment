package gymquest.Game;
import java.util.Scanner; // Importerar Scanner

public class GameHelper {
    private Scanner scanner;

    public GameHelper() { // Konstruktor som skapar scanner för att läsa in användarens val
        this.scanner = new Scanner(System.in);
    }
    public String readInput() { // Inläsaren
        System.out.println("Name your hero: ");
        return scanner.nextLine();
    }
    public void close(){ // Stänger scanner
        scanner.close();
    }
    // Chans för varje monster/guld osv ska det vara här ??
}
