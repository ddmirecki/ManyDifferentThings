package asd.pl.knight;

/**
 * Created by RENT on 2017-01-14.
 */
public class Knight {
    private Weapon weapon;

    public Knight(){

    }

    public Knight(Weapon weapon) {
        this.weapon = weapon;
    }

    public void fight(){
        System.out.println("knight is fighting...");
        weapon.use();
    }

    public static void main(String[] args) {
        Weapon weapon = new Sword(); // mozna tak zrobic bo sword implementuje weapon
        Knight knight = new Knight(weapon);
        knight.fight();

        Knight knightt2 = new Knight(new Axe());
        knightt2.fight();

        Knight knight3 = new Knight(new Weapon() {
            @Override
            public void use() {
                System.out.println("bashing with club");
            }
        });
        knight3.fight();

    }
}
