package gymquest.Game;

import gymquest.Characters.Hero;
import gymquest.Items.Weapon;

import java.util.concurrent.CompletionStage;

public class Shop {
    private final GameHelper reader; // Import för att använda scanner
    private final Hero hero;

    public Shop(GameHelper reader, Hero hero) {
        this.reader = reader;
        this.hero = hero;
    }

    public void open(){
        boolean inShop = true;
        while (inShop) {
            System.out.println("\n=== Shop ===");
            System.out.println("[1] Buy' 'Wrist wraps' (Damage 25) - Cost: 30 gold");
            System.out.println("[2] Buy' 'Creatine powder' (Damage 30) - Cost: 40 gold");
            System.out.println("[3] Buy' 'Protein powder' (Focus 25) - Cost: 50 gold");
            System.out.println("[4] Buy' '1 hour PT class' (Motivation 30) - Cost: 60 gold");
            System.out.println("[0] Exit shop");
        }
}
}
