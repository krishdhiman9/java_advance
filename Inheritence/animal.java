package Inheritence;

class dog{
    String name;
    String color;
    public String getname(){
        return name;

    } 
    public void setname(String n){
        name = n;
    } 
     public String getcolor(){
        return color;

    } 
    public void setcolor(String c){
        color = c;
        
    } 
}
class cat extends dog{
    String namex;
    String colorx;
    public String getnamex(){
        return namex;

    } 
    public void setnamex(String a){
        namex = a;
        
    } 
     public String getcolorx(){
        return colorx;

    } 
    public void setcolorx(String b){
        colorx = b;
        
    } 
}


public class animal {
    public static void main(String[]args){
        dog d = new dog();
        d.setname("pitbull");
        d.setcolor("black");
        System.out.println(d.getname());
        System.out.println(d.getcolor());

        cat c = new cat();
        c.setnamex("tom");
        c.setcolorx("white");
        System.out.println(c.getnamex());
        System.out.println(c.getcolorx());

        
    }
    
}
