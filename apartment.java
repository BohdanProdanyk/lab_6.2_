public class Apartment {
    String city;
    String district;

    public Apartment(String city, String district){
        this.city = city;
        this.district = district;
    }
    void map(){
        String str = city + " ".concat(district);
        System.out.println(str);
    }
}
