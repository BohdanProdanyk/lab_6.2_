public class Furniture {
    String kitchen;
    int kit;
    String badroom;
    int bad;
    String toilet;
    int toi;
    String living_room;
    int liv;
    String wardrobe;
    int war;

    public Furniture(String kitchen, int kit, String badroom, int bad, String toilet, int toi, String living_room, int liv, String wardrobe){
        this.kitchen = kitchen;
        this.badroom = badroom;
        this.toilet = toilet;
        this.living_room = living_room;
        this.wardrobe = wardrobe;
        this.kit = kit;
        this.bad = bad;
        this.toi = toi;
        this.liv = liv;
    }
    void sum(){
        int m = kit + bad + toi + liv;
        System.out.println(m);
    }

}
