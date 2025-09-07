package dayFour;

public class HomeRoomArea {
    static void main(String[] args) {

//        Rectangle room1 = new Rectangle();
//        double area = room1.getArea(5,9); //45
//        System.out.println("Area of room is " + area + "m");

        Rectangle room2 = new Rectangle();
        room2.setLength(5.5);
        room2.setWidth(9.6);

        double areaOfRoom2 = room2.calculateArea();
        System.out.println("Area of room 2 is : " + areaOfRoom2);

    }
}
