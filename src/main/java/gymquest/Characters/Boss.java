package gymquest.Characters;

public class Boss extends Character {
    public Boss(String name, int hp, int damage) {
        super(name, hp, damage);
    }

    @Override
    public int attack() {
        if (Math.random() < 0.3) { // 30 % chans för specialattack
            System.out.println("Specialattack!");
            return getDamage() * 2;
        }
        return getDamage();
    }
}
