//Класс содержащий информацию о броне и использующий конструктор
package main.builder;

public class Armory {
    private String ArmoryName, ArmoryType;
    private int Defence;

    public void setArmoryName(String armoryName) {
        ArmoryName = armoryName;
    }

    public void setArmoryType(String armoryType) {
        ArmoryType = armoryType;
    }

    public void setDefence(int defence) {
        Defence = defence;
    }

    public String getArmoryName() {
        return ArmoryName;
    }

    public String getArmoryType() {
        return ArmoryType;
    }

    public int getDefence() {
        return Defence;
    }

    public Armory(String armoryName, String armoryType, int defence){
        ArmoryName = armoryName;
        ArmoryType = armoryType;
        Defence = defence;
    }
}
