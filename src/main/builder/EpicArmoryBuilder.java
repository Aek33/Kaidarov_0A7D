package main.builder;

public class EpicArmoryBuilder implements ArmoryBuilder {
    @Override
    public Armory createArmor(Items ItemName) {

        Armory armory;

        switch (ItemName){
            case HARD_BREASTPLATE:
                armory = new Armory("Латный доспех", "Нагрудник", 200);
                break;
            case HARD_HELMET:
                armory = new Armory("Латный шлем", "Шлем", 100);
                break;
            default:
                throw new IllegalStateException("Неизвестный предмет: " + ItemName);
        }
        return armory;
    }
}
