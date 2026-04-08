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
class chlidOfDerivde extends derived{
    chlidOfDerivde(){
        System.out.println("i am a child of derived class");
    }
    chlidOfDerivde(int x,int y,int z){
        super(x, y);
        System.out.println("i am in overloaded constructor of childofoverloaded with value z as: "+ z);
    }
}
public class constructor {
    public static void main(String[] args) {
        //base1 b = new base1 (2);
        //base1 b = new base1(3);
        //derived d = new derived();
        //derived d = new derived(2,2);
        //chlidOfDerivde cd = new chlidOfDerivde();
        chlidOfDerivde d = new chlidOfDerivde(2, 3,4);
        
    }
}