package simpleduckapp.so3;

public abstract class Character {

    private WeaponBehavior weapon;

    public abstract void fight();

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    
    
}
