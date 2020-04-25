
package main.abstractFactory;

import main.builder.Armory;
import main.builder.Weapon;

public interface RandomFactrory {
    Weapon createRandomWeapon();
    Armory createRandomArmor();
}
