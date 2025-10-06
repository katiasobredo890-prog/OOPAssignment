package gymquest.Game;
import java.awt.*;
import gymquest.Characters.Hero;


public class Main {
    public static void main(String[] args) {

        GameHelper gameHelper = new GameHelper(); // Skapar objekt av klassen Gamehelper
        String heroName = gameHelper.readInput(); // Skapar metod av scannern
        Hero hero = new Hero(heroName); // Skapar hjälten
        Menu menu = new Menu(gameHelper, hero); // Skapar meny
        menu.start(); // Startar meny
    }
}


