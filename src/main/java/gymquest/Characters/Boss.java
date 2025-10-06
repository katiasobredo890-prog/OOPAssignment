package gymquest.Characters;

public class Boss extends Monster {

    public Boss(String name, int hp, int damage, int xpReward, int goldReward) {
        super(name, hp, damage, xpReward);
        setXpReward(xpReward);
    }

    @Override
    public int attack() {
        if (Math.random() < 0.3) { // 30 % chans för specialattack
            System.out.println("\uD83D\uDC80 YOU DROPPED THE BAR \uD83D\uDC80");
            return getDamage() * 2;
        }
        return getDamage(); // Annars normal skada
    }
    @Override // Tom override som finns för att superklassen kräver att metoden ska finnas
    public void randomXp() {

    }
}

