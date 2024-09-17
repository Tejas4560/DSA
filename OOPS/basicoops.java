public class basicoops{
    public static void main(String[] args) {
        Pen p1=new Pen();
    p1.setcolour("green");
    System.out.println(p1.getcolour());
    p1.tipsize(5);
    System.out.println(p1.gettip());
    }

}
class Pen{
    private String colour;
    private int tip;

    void setcolour(String colour){
          this.colour=colour;

    }
    String getcolour(){
        return this.colour;

    }
    void tipsize(int size){
        this.tip=size;
    }
    int gettip(){
        return this.tip;
    }
}