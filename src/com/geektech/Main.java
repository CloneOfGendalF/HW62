package com.geektech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BigBoss boss = new BigBoss();
        boss.setDMG(80);
        boss.setHP(800);
        boss.setName("BlackPrince");


        WeaponGun T72 = new WeaponGun();
        T72.setNameOfGun("Т72");
        T72.setTypeOfGun("Tank");
        T72.getDmgOfGun(100);


        boss.setTankForBigBoss(T72);
        System.out.println(boss.printInfo());

        ZombieSkeletons skeleton = new ZombieSkeletons();
        skeleton.setHP(650);
        skeleton.setDMG(45);
        skeleton.setArrow(5);

        WeaponGun skeletonArrow = new WeaponGun();
        skeletonArrow.setTypeOfGun(" Чё за оружие???!");
        skeletonArrow.setNameOfGun(" Танк");

        skeleton.setWeaponGun(skeletonArrow);

        System.out.println(skeleton.printInfo());


    }



}
