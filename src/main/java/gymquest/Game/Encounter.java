package gymquest.Game;

import gymquest.Characters.EgoLift;
import gymquest.Characters.Monster;
import gymquest.Characters.Boss;

public class Encounter {
    public Monster generateEncounter() {
        double chance = Math.random(); // Skapar slumpvärde mellan 0.0 och 1.0, avgör vem man möter

        if (chance < 0.7) { // 70% chans vanligt monster
            System.out.println("You ego-lifted and pulled a muscle!");
            return new EgoLift("burnet out", 50, 10, 20, 10); // Return new skapar nytt objekt av klassen Egolift
        } else if (chance < 0.9) { // 20% chans
            return new Boss("overtraining", 50, 10, 20, 10);
        } else {
            System.out.println("You had a good workout!");
            return null;
        }
    }
}
