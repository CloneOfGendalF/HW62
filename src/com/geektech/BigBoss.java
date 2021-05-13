package com.geektech;

public class BigBoss extends GameEntity {
    WeaponGun tankForBigBoss;

    public WeaponGun getWeapon() {
        return tankForBigBoss;
    }
    public void setWeaponGun(WeaponGun weapon) {
        this.tankForBigBoss = weapon;
    }
    public String printInfo() {
        return getHP() + "-HP;  " + getDMG() + "-Урон;  " + getWeapon().getNameOfGun() + "-Мозгомёт;  "
                + getWeapon().getTypeOfGun() + "-Из говна, палок и костей!  ";
    }

    public WeaponGun getTankForBigBoss() {
        return tankForBigBoss;
    }

    public void setTankForBigBoss(WeaponGun tankForBigBoss) {
        this.tankForBigBoss = tankForBigBoss;
    }
}
