//Строитель обычного оружия
package main.builder;

import org.jetbrains.annotations.NotNull;

public class SimpleWeaponBuilder implements WeaponBuilder {
    @Override
    public Weapon createWeapon(@NotNull Items ItemName){

        Weapon weapon;

        switch (ItemName){
            case SIMPLE_HAMMER:
                weapon = new Weapon.WeaponBuilder()
                        .withWeaponName("Молот")
                        .withWeaponType("Двуручное")
                        .withCrushingDamage(100)
                        .withAttackSpeed(0.5)
                        .create();
                break;

            case SIMPLE_BOW:
                weapon = new Weapon.WeaponBuilder()
                        .withWeaponName("Лук")
                        .withWeaponType("Стрелковое")
                        .withPrickingDamage(50)
                        .withAttackSpeed(0.5)
                        .create();
                break;

            case SIMPLE_SWORD:
                weapon = new Weapon.WeaponBuilder()
                        .withWeaponName("Меч")
                        .withWeaponType("Одноручное")
                        .withCuttingDamage(75)
                        .withPrickingDamage(25)
                        .withAttackSpeed(1)
                        .create();
                break;

            default:
                throw new IllegalStateException("Неизвестный предмет: " + ItemName);
        }
        return weapon;
    }
}
