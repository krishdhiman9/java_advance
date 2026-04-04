package Inheritence;

class base1{
    
    base1(){
        System.out.println("i am in base1 constructor");
    }
    base1(int x){
        System.out.println("i am in overloaded constructor with value "+ x);
    }
}

class derived extends base1{
    derived(){
        //super(2);
    System.out.println("i am in derived constructor");
}
    derived(int x, int y){
        super(x);
        System.out.println("i am in overloaded constructor of derivede with value of y as : " + y);

    }
}

public class constructor {
    public static void main(String[] args) {
        // base1 b = new base1 ();
        //derived d = new derived();
        derived d = new derived(2,2);
        
    }
    
}
