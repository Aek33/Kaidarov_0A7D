package House;

import org.jetbrains.annotations.NotNull;

public class Apartment {
    Room room;
    Apartment apartment;
    private int ApartmentNumber;
    private double TotalArea;
    private String Rooms = "";

    public int getApartmentNumber() {
        return ApartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        ApartmentNumber = apartmentNumber;
    }

    public double getTotalArea() {
        return TotalArea;
    }

    public void setTotalArea(double totalArea) {
        TotalArea = totalArea;
    }

    public String getRooms() {
        return Rooms;
    }

    public void setRooms(String rooms) {
        Rooms = rooms;
    }

    public Apartment(int apartmentNumber){
        ApartmentNumber = apartmentNumber;
    }

    public void addRoom(@NotNull Room room){
        this.Rooms = this.Rooms + room.getRoomType() + " ";
        this.TotalArea = this.TotalArea + room.getArea();
    }
}
