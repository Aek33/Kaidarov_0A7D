package main;

import main.abstractFactory.EpicFatory;
import main.abstractFactory.RandomFactrory;
import main.abstractFactory.SimpleFactory;
import main.builder.Weapon;
import main.decorator.EnchantmentDecorator;

public class Main {

    public static void main(String[] args){
        RandomFactrory factory;

        factory = new EpicFatory();

        for (int i = 0; i < 20; i++){
            System.out.println(factory.createRandomArmor().getArmoryName());
            System.out.println(factory.createRandomWeapon().getWeaponName());
        }

        Weapon RWeapon = factory.createRandomWeapon();

        EnchantmentDecorator EWeapon = new EnchantmentDecorator(RWeapon);
        System.out.println(EWeapon.getWeaponName());


    }
}
