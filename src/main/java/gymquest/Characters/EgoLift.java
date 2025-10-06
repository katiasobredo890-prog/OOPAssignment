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
        if (chance < 0.4) { // 40% chans till randomXp
            System.out.println("⚡⚡⚡ WOW! You got a pre-workout from your gym-bro! You have so much energy! (+40 Motivation) ⚡⚡⚡");
            setXpReward(getXpReward() + 40);
        }
    }
}
