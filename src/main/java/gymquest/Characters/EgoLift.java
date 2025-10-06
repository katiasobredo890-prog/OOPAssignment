package gymquest.Characters;

public class EgoLift extends Monster {
    public EgoLift(String name, int hp, int damage, int xpReward) {

        super(name, hp, damage, xpReward);
    }

    @Override
    public int attack() { // Ärvd attack metod som just här returnerar monstrets skada
        return getDamage();
    }

    @Override // Gjorde en override på monsterklassens abstrakta metod för att ge slumpmässig chans till randomXp
    public void randomXp() {
        double chance = Math.random();
        if (chance < 0.5) { // 40% chans till randomXp
            System.out.println("⚡⚡⚡ WOW! You got a pre-workout from your gym-bro! You have so much energy! (+40 Motivation) ⚡⚡⚡");
            setXpReward(getXpReward() + 40);
        }
    }
}
