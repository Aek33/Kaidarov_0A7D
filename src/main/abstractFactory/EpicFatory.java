//Фабрика создающая только усиленные предметы
package main.abstractFactory;

import main.builder.*;

import java.util.Random;

public class EpicFatory implements RandomFactrory {

    @Override
    public Weapon createRandomWeapon(){

        Weapon weapon = null;

        Random weaponRandom = new Random();

        int randomNumber = weaponRandom.nextInt(3);

        switch (randomNumber){
            case 0:
                weapon = new EpicWeaponBuilder().createWeapon(Items.HARD_HAMMER);
                break;

            case 1:
                weapon = new EpicWeaponBuilder().createWeapon(Items.HARD_SWORD);
                break;

            case 2:
                weapon = new EpicWeaponBuilder().createWeapon(Items.HARD_BOW);
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
                armory = new EpicArmoryBuilder().createArmor(Items.HARD_HAMMER);
                break;
            case 1:
                armory = new EpicArmoryBuilder().createArmor(Items.HARD_HELMET);
                break;
            default:
        }
        return armory;
    }
}
