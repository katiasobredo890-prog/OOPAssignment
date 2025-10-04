package gymquest.Game;

import gymquest.Characters.EgoLift;
import gymquest.Characters.Monster;
import gymquest.Characters.Boss;

public class Encounter {
    public Monster generateEncounter() {
        double chance = Math.random();

        if (chance < 0.7) { // 20% chans
            System.out.println("You ego-lifted and pulled a muscle!");
            return null; // NULL ?????
        } else if (chance < 0.9) { // 70% chans
            return new EgoLift("overtraining", 50, 10, 20, 10);
        } else {
            System.out.println("You had a good workout!");
            return null;
        }
    }
}
