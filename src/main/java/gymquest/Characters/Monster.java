package gymquest.Characters;



public abstract class Monster extends Character {
    private int xpReward;
    private int goldReward;

    public Monster(String name, int hp, int damage, int xpReward) {
        super(name, hp, damage);
        this.xpReward = xpReward;

        }
        protected void setXpReward ( int xp){
            this.xpReward = xp;
        }
        public int getXpReward () {
            return xpReward;
        }
        public int getGoldReward () {
            return goldReward;
        }
        protected void setGoldReward ( int g){
            this.goldReward = g;
        }
        public abstract void randomXp(); // Abstrakt metod
    }
