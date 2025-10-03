package gymquest.Game;
import java.awt.*;
import gymquest.Characters.Hero;
import gymquest.Game.GameHelper;
import gymquest.Game.Menu;


public class Main {
    public static void main(String[] args) {

        GameHelper gameHelper = new GameHelper();
        String heroName = gameHelper.readInput();
        Hero hero = new Hero(heroName);
        Menu menu = new Menu(gameHelper, hero);
        menu.start();
    }
}


