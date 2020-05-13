package House;

import java.util.ArrayList;

public class FirstFloor{
    ArrayList<Apartment> FirstFloorArray;

    public FirstFloor(){
        FirstFloorArray = new ArrayList<>();

        Room Bathroom = new Room("Ванная комната", 4);
        Room Kitchen = new Room("Кухня", 13.2);
        Room Bedroom1 = new Room("Спальная", 15.4);
        Room LivingRoom1 = new Room("Гостинная", 16.3);
        Room Bedroom2 = new Room("Спальная", 18.8);
        Room LivingRoom2 = new Room("Гостинная", 16.9);


        Apartment N101 = new Apartment(1);
        N101.addRoom(Bathroom);
        N101.addRoom(Kitchen);
        N101.addRoom(Bedroom1);

        Apartment N102 = new Apartment(2);
        N102.addRoom(LivingRoom1);
        N102.addRoom(Bedroom2);
        N102.addRoom(Bathroom);

        Apartment N103 = new Apartment(3);
        N101.addRoom(Bathroom);
        N101.addRoom(LivingRoom2);
        N101.addRoom(Bedroom1);

        FirstFloorArray.add(N101);
        FirstFloorArray.add(N102);
        FirstFloorArray.add(N103);
    }


}
