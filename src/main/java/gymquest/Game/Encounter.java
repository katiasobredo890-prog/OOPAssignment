package gymquest.Game;

import gymquest.Characters.EgoLift;
import gymquest.Characters.Monster;
import gymquest.Characters.Boss;

public class Encounter {
    public Monster generateEncounter() {
        double chance = Math.random(); // Skapar slumpvärde mellan 0.0 och 1.0, avgör vem man möter

        if (chance < 0.7) { // 70% chans vanligt monster
            EgoLift egoLift = new EgoLift("burnout", 60, 15,30); // Return new skapar nytt objekt av klassen Egolift
            egoLift.randomXp(); // Hämtar randomXp metoden som kan ge extra reward
            return egoLift;
        } else if (chance < 0.9) { // 20% chans
            return new Boss("overtraining", 100, 30, 50, 40);
        } else {
            System.out.println("You had a good workout and went home to eat! \uD83D\uDC4C");
            return null;
        }
    }
}
