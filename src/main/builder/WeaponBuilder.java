//Интерфейс для строителей Оружия
package main.builder;

public interface WeaponBuilder {
    Weapon createWeapon(Items ItemName);
}
