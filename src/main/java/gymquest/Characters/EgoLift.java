package gymquest.Characters;

public class EgoLift extends Monster {
    public EgoLift(String name, int hp, int damage, int xpReward, int goldReward) {

        super(name, hp, damage, xpReward);
        setGoldReward(goldReward); // TA BORT???
    }

    @Override
    public int attack() { // Ärvd attack metod som just här returnerar monstrets damage värde
        return getDamage();
    }

    @Override
    public void randomXp() {
        double chance = Math.random();
        if (chance < 0.4) { // 30% chans till randomXp
            System.out.println("You got a pre-workout from your gymbro! You have so much energy! (+10 XP)");
            setXpReward(getXpReward() + 20);
        }
    }
}
