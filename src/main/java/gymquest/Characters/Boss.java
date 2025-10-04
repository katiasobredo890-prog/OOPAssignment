package gymquest.Characters;

public class Boss extends Monster {

    public Boss(String name, int hp, int damage, int xpReward, int goldReward) {
        super(name, hp, damage, xpReward);
        setXpReward(xpReward);
        setGoldReward(goldReward);
    }

    @Override
    public int attack() {
        if (Math.random() < 0.3) { // 30 % chans för specialattack
            System.out.println("You got OVERTRAINED");
            return getDamage() * 2;
        }
        return getDamage();
    }

    @Override
    public void randomXp() {

    }
}
