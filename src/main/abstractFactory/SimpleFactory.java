//Фабрика создающая только обычные предметы
package main.abstractFactory;

import main.builder.*;

import java.util.Random;

public class SimpleFactory implements RandomFactrory {

    @Override
    public Weapon createRandomWeapon(){

        Weapon weapon = null;

        Random weaponRandom = new Random();

        int randomNumber = weaponRandom.nextInt(3);

        switch (randomNumber){
            case 0:
                weapon = new SimpleWeaponBuilder().createWeapon(Items.SIMPLE_HAMMER);
                break;

            case 1:
                weapon = new SimpleWeaponBuilder().createWeapon(Items.SIMPLE_SWORD);
                break;

            case 2:
                weapon = new SimpleWeaponBuilder().createWeapon(Items.SIMPLE_BOW);
                break;
        }
        return weapon;
    }

    @Override
    public Armory createRandomArmor() {

        Armory armory = null;

        Random armorRandom = new Random();

        int randomNumber = armorRandom.nextInt(2);

        switch (randomNumber){
            case 0:
                armory = new SimpleArmoryBuilder().createArmor(Items.SIMPLE_BREASTPLATE);
                break;
            case 1:
                armory = new SimpleArmoryBuilder().createArmor(Items.SIMPLE_HELMET);
                break;
        }
        return armory;
    }
}
