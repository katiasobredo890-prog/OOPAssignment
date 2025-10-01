package Character;

public class Heroe extends Character {

    @Override
    public String name() // här ska användaren få välja med scanner
    {
        return null; // metoden ska returnera string
    }

    @Override
    public int hp() {
        return 0;
    }

    @Override
    public int damage() {
        return 0;
    }

    int xp = 0;
    int hp = 100;
    int gold = 0;
    int damage = 10;

}
