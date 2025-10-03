package gymquest.Game;

import gymquest.Characters.EgoLift;
import gymquest.Characters.Monster;

public class Encounter {
    public Monster generateEncounter() {
        double chance = Math.random();

        if (chance < 0.7) {
            return new EgoLift("Egolyftaren", 50, 10, 20, 10);
        } else if (chance < 0.9) {
            // LÄGG TILL BOSS
            System.out.println("BOSS BLA BLA");
            return null;
        }// FÖRKLARING?
        else {
            System.out.println("SAFETY");
            return null;
        }
    }
}
