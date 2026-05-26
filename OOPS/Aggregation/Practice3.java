package OOPS.Aggregation;
class Room {
    void showRoom(){
        System.out.println("Room is Available");
    }
}
class House {
    Room room;
    House(){
        room = new Room();
    }
    void showHouse(){
        room.showRoom();
    }
}
public class Practice3 {
    public static void main(String[] args) {
        House house = new House();
        house.showHouse();
    }
}
