package main.decorator;

import main.builder.Weapon;

public class EnchantmentDecorator extends BaseDecorator{
    Weapon weapon;

    public EnchantmentDecorator(Weapon weapon){
        this.weapon = weapon;
    }

    @Override
    public String getWeaponName(){
        return "Зачарованый " + weapon.getWeaponName();
    }

}
