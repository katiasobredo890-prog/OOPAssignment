package gymquest.Characters;

public class EgoLift extends Monster {
    public EgoLift(String name, int hp, int damage, int xpReward, int goldReward) {

        super(name, hp, damage);
        setGoldReward(goldReward);
    }

    @Override
    public int attack() { // Ärvd attack metod som just här returnerar monstrets damage värde
        return getDamage();
    }
} // GÖR GOLD REWARD
