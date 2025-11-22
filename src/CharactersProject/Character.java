package CharactersProject;

public class Character {

    private double life;
    private double strengh;
    private double defense;
    private Weapon weapon;


    public double getLife() {
        return life;
    }

    public void setLife(double life) {
        this.life = life;
    }

    public double getStrengh() {
        return strengh;
    }

    public void setStrengh(double strengh) {
        this.strengh = strengh;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public double Hit(Weapon w) {
        return this.strengh += w.getBonusDamage();
    }

    public double Defense() {
        return this.defense - this.strengh;
    }

}
