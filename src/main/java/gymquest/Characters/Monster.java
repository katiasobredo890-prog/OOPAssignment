package gymquest.Characters;

public abstract class Monster extends Character {
    public Monster (String name, int hp, int damage) {
        super(name, hp, damage);
    }
    @Override
    public int attack(){
        return getDamage();
    }


}