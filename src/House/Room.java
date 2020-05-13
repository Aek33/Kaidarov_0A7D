package House;

public class Room {
    private double Area;
    private String RoomType;


    public void setArea(double area) {
        Area = area;
    }

    public double getArea() {
        return Area;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
    }

    public String getRoomType() {
        return RoomType;
    }

    public Room(String roomType, double area){
        RoomType = roomType;
        Area = area;
    }


}
