//package Inheritence;
//create two class and perform operation..
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

public class animal{
    public static void main(String[]args){
        dog d = new dog();
        // cat c = new cat();
        // c.setnamex("pitbull");
        // System.out.println(c.getname());
        d.setname("pitbull");
        d.setcolor("black");
        System.out.println("dog name is "+d.getname());
        System.out.println("dog's color is "+d.getcolor());

        cat c = new cat();
        c.setnamex("tom");
        c.setcolorx("white");
        System.out.println("cat name is "+c.getnamex());
        System.out.println("cat's color is "+c.getcolorx());
}
}

