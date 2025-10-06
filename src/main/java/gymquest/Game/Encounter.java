package gymquest.Game;

import gymquest.Characters.EgoLift;
import gymquest.Characters.Monster;
import gymquest.Characters.Boss;

public class Encounter {
    public Monster generateEncounter() {
        double chance = Math.random(); // Skapar slumpvärde mellan 0.0 och 1.0, avgör vem man möter FÖRKLARAAAAAAA

        if (chance < 0.7) { // 70% chans vanligt monster
            EgoLift egoLift = new EgoLift("burnout", 60, 20,30,20); // Return new skapar nytt objekt av klassen Egolift
            egoLift.randomXp(); // Hämtar randomXp
            return egoLift;
        } else if (chance < 0.9) { // 20% chans
            return new Boss("overtraining", 120, 30, 50, 40);
        } else {
            System.out.println("You had a good workout and went home to eat! \uD83D\uDC4C");
            return null; // VARFÖR NULL HÄR OCH EJ BARA RETURN
        }
    }
}
