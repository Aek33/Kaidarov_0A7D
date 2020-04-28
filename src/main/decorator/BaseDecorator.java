package main.decorator;

import main.builder.Weapon;

public abstract class BaseDecorator extends Weapon {
    public abstract String getWeaponName();
}
