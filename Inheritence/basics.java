package Inheritence;
//basics
class base{
    String namex;
    int agex;

    public String getnamex(){
        return namex;
    }
    public void setnamex(String n){
        this.namex = n;
    }

    public int getagex(){
        return agex;

    }
    public void setagex(int a){
        this.agex =a;
    }
    
}
class Bb extends base{
    String namey;
    int agey;
       
    public String getnamey(){
        return namey;
    }
    public void setnamey(String b){
        this.namey = b;
    }

    public int getagey(){
        return agey;

    }
    public void setagey(int c){
        this.agey =c;
    }
    
}

public class basics {
    public static void main(String[] args) {
        base b = new base();
       
        b.setnamex("krish dhiman");
        b.setagex(19);
        System.out.println(b.getnamex());
        System.out.println(b.getagex());

        Bb d = new Bb();
        d.setnamey("kd");
        d.setagey(20);
        System.out.println(d.getnamey());
        System.out.println(d.getagey());



    }
    
}
