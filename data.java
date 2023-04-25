public class Data {
    int floor;
    int room;
    double area;
    String parking;


    public Data(int floor, int room, double area, String parking){
        this.floor = floor;
        this.room = room;
        this.area = area;
        this.parking = parking;
    }
    void ploshcha_one(){
        double q = (area / room);
        System.out.println(q);
    }
}
