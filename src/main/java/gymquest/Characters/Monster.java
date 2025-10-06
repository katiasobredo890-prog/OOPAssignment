package gymquest.Characters;



public abstract class Monster extends Character {
    private int xpReward; // Privat variabel för hur mycket xp hjälten får när monstret dör

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

        public abstract void randomXp(); // Abstrakt metod för randomXp
    }
