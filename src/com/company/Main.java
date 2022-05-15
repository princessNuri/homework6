package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss=new Boss(200,50);
        Skeleton skeleton =new Skeleton(150,35,20);
        boss.weapon.setNameOfWeapon("Gun");
        boss.weapon.setTypeOfWeapon("Fire");
        skeleton.weapon.setNameOfWeapon("Knife");
        skeleton.weapon.setTypeOfWeapon("Cold");
        Skeleton skeleton1 =new Skeleton(140,45,21);
        skeleton1.weapon.setNameOfWeapon("Kinjal");
        skeleton1.weapon.setTypeOfWeapon("Sharp");
        System.out.println("Boss info : "+boss.getInfo());
        System.out.println("First skeleton info : "+skeleton.getInfo());
        System.out.println("Second skeleton info :"+skeleton1.getInfo());

    }
}
