//Класс содержащий основу для конструирования Оружия
package main.builder;

public class Weapon {
//У каждого оружия есть имя, тип и скорость атаки, однако тип наносимого урона различеный
    private String WeaponName, WeaponType;
    private int CrushingDamage, CuttingDamage, PrickingDamage;
    private double AttackSpeed;

    public void setWeaponName(String WeaponName){
        this.WeaponName = WeaponName;
    }

    public void setWeaponType(String WeaponType){
        this.WeaponType = WeaponType;
    }

    public void setCrushingDamage(int CrushingDamage){
        this.CrushingDamage = CrushingDamage;
    }

    public void setCuttingDamage(int CuttingDamage){
        this.CuttingDamage = CuttingDamage;
    }

    public void setPrickingDamage(int PrickingDamage){
        this.PrickingDamage = PrickingDamage;
    }

    public void setAttackSpeed(int AttackSpeed){
        this.AttackSpeed = AttackSpeed;
    }

    public String getWeaponName(){
        return WeaponName;
    }

    public String getWeaponType() {
        return WeaponType;
    }

    public int getCrushingDamage() {
        return CrushingDamage;
    }

    public int getCuttingDamage() {
        return CuttingDamage;
    }

    public int getPrickingDamage() {
        return PrickingDamage;
    }

    public double getAttackSpeed() {
        return AttackSpeed;
    }


    public static class WeaponBuilder{

        private Weapon NewWeapon;

        public WeaponBuilder(){
            NewWeapon = new Weapon();
        }

        public WeaponBuilder withWeaponName(String WeaponName){
            NewWeapon.WeaponName = WeaponName;
            return this;
        }

        public WeaponBuilder withWeaponType(String WeaponType){
            NewWeapon.WeaponType = WeaponType;
            return this;
        }

        public WeaponBuilder withCrushingDamage(int CrushingDamage){
            NewWeapon.CrushingDamage = CrushingDamage;
            return this;
        }

        public WeaponBuilder withCuttingDamage(int CuttingDamage){
            NewWeapon.CuttingDamage = CuttingDamage;
            return this;
        }

        public WeaponBuilder withPrickingDamage(int PrickingDamage){
            NewWeapon.PrickingDamage = PrickingDamage;
            return this;
        }

        public WeaponBuilder withAttackSpeed(double AttackSpeed){
            NewWeapon.AttackSpeed = AttackSpeed;
            return this;
        }

        public Weapon create(){
            return NewWeapon;
        }

    }
}
