package gymquest.Characters;



public abstract class Monster extends Character {
    private int xpReward;
    private int goldReward;

    public Monster(String name, int hp, int damage) {
        super(name, hp, damage);
    }

    public int getXpReward() {
        return xpReward;
    }
    public int getGoldReward() {
        return goldReward;
    }
    protected void setGoldReward(int g) {
        this.goldReward = g; }
}