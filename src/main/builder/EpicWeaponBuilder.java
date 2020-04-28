//Строитель услиенного оружия
package main.builder;

import org.jetbrains.annotations.NotNull;

public class EpicWeaponBuilder implements WeaponBuilder {
    @Override
    public Weapon createWeapon(@NotNull Items ItemName) {

        Weapon weapon;

        switch (ItemName){
            case HARD_HAMMER:
                weapon = new Weapon.WeaponBuilder()
                        .withWeaponName("Стальной Молот")
                        .withWeaponType("Двуручное")
                        .withCrushingDamage(200)
                        .withAttackSpeed(0.5)
                        .create();
                break;

            case HARD_BOW:
                weapon = new Weapon.WeaponBuilder()
                        .withWeaponName("Крепкий Лук")
                        .withWeaponType("Стрелковое")
                        .withPrickingDamage(100)
                        .withAttackSpeed(0.5)
                        .create();
                break;

            case HARD_SWORD:
                weapon = new Weapon.WeaponBuilder()
                        .withWeaponName("Стальной Меч")
                        .withWeaponType("Одноручное")
                        .withCuttingDamage(125)
                        .withPrickingDamage(50)
                        .withAttackSpeed(1)
                        .create();
                break;

            default:
                throw new IllegalStateException("Неизвестный предмет: " + ItemName);
        }
        return weapon;
    }
}
