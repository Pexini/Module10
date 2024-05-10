package Hard.WorldBattle.Weapons;

public class Gun implements Weapon{
    @Override
    public String getName() {
        return "Gun";
    }

    @Override
    public int getDamage() {
        return 25;
    }
}
