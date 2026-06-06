package Inheritence;
class namee{
    int age ;
    String name;
    double marks;

    namee(){
        age = 0;
        name = "Unknown";
        marks = 0;
    }
    namee(int age){
        System.out.println(this.age=age);
        this.name="unknown";
        this.marks=0;
    }
    namee(int age,String name,double marks) {
        this.age = age;
        this.name = name;
        this.marks = marks;
    }
}
public class name {
    public static void main(String[] args) {
        namee n = new namee(24,"krish", 3.4);
        System.out.println(n.age);
        System.out.println(n.name);
        System.out.println(n.marks);


    }
}
