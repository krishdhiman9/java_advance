package Inheritence;
//Create a class Circle and use inheritance to create another class Cylinder from it.
class circle{
    double r = 3;
    
    circle(){
     System.out.println("area of circle = " + 3.14*r*r);
    }
    circle(double r){
        System.out.println("circumfrenece of circle = " +2*3.14*r );
    }
}

class cylinder extends circle{
    int v = 3;
    int r = 3;
    int h = 3;
    cylinder(){
        System.out.println("volume of cylinder = " + 3.14*r*r*h);
    }
    cylinder(double r,double h){
        super(r);
        System.out.println("total surface area of cirlce = " + 2*3.14*r*(r+h));

    }
}


public class circle_cylinder {
    public static void main(String[] args) {
        //circle c = new circle();
        //circle cc = new circle(3);
        //cylinder c = new cylinder();
        cylinder cc = new cylinder(4, 2);
    }
}
