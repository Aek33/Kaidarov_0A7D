package main.builder;

import org.jetbrains.annotations.NotNull;

public class SimpleArmoryBuilder implements ArmoryBuilder {
    @Override
    public Armory createArmor(@NotNull Items ItemName) {

        Armory armory;

        switch (ItemName){
            case SIMPLE_BREASTPLATE:
                armory = new Armory("Кольчужный доспех", "Нагрудник", 100);
                break;
            case SIMPLE_HELMET:
                armory = new Armory("Кольчужный койф", "Шлем", 50);
                break;
            default:
                throw new IllegalStateException("Неизвестный предмет: " + ItemName);
        }
        return armory;
    }
}
