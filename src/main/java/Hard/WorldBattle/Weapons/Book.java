package Hard.WorldBattle.Weapons;

public class Book implements Weapon{
    @Override
    public String getName() {
        return "Book";
    }

    @Override
    public int getDamage() {
        return 15;
    }
}
