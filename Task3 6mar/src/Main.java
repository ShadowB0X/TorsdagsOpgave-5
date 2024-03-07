import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Room> rooms = new ArrayList<>();
        ArrayList<Building> buildings = new ArrayList<>();

        Room room = new Room(1, 1, 2);
        Room room1 = new Room(2, 2, 2);
        Room room2 = new Room(5, 4, 4);
        Building building = new Building(4, 4, 4, "Yes");

        rooms.add(room);
        rooms.add(room1);
        rooms.add(room2);
        buildings.add(building);


//        static boolean isNormal (building) {
//        if (Rooms < ni)
//
//            return buildings;
//
//    }


        private static void CountLampsInBuilding (ArrayList <Room> rooms) {
            for (Room rlist : rooms) {
                System.out.println(rlist);
            }
        }
    }
}