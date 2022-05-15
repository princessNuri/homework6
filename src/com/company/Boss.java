package com.company;

public class Boss  extends GameEntity{
    Weapon weapon = new Weapon();


    public Boss(int health, int damage) {
        super(health, damage);
    }

    public Weapon getBossWeapon() {
        return weapon;
    }

    public void setBossWeapon(Weapon bossWeapon) {
        this.weapon = bossWeapon;
    }

    public String getInfo() {
        return "Health : "+getHealth()+"   "+"Damage :"+getDamage()+"   "+"Type of weapon : "+weapon.getTypeOfWeapon()+"   "+"Name of weapon :"+weapon.getNameOfWeapon();
    }
}



