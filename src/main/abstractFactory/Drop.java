//Код, использующий фабрику, не волнует с какой конкретно фабрикой он работает.
//Все получатели продуктов работают с продуктами через абстрактный интерфейс.
package main.abstractFactory;

import main.builder.Armory;
import main.builder.Weapon;
import org.jetbrains.annotations.NotNull;

public class Drop {

    public Drop(@NotNull RandomFactrory randomFactrory){
        Weapon weapon = randomFactrory.createRandomWeapon();
        Armory armory = randomFactrory.createRandomArmor();
    }

}
