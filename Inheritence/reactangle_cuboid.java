package Inheritence;
class rectangle{
    rectangle(){
        System.out.println("i am in rectangle");
    }
    rectangle(int x){
        System.out.println("i am in super key word 1");
    }
}
class cuboid{
    cuboid(){
        System.out.println("i am in cuboid ");
    }
    cuboid(int x, int y ){
        super();
        System.out.println("i am in super key word 2");
    }
}


public class reactangle_cuboid {
    public static void main(String[] args) {
        cuboid c = new cuboid();



    }
}
