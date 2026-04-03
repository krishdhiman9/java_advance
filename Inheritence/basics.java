package Inheritence;

import Inheritence.base.subase;
class base{
    String name;
    int age;

    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }

    public int getage(){
        return age;

    }
    public void setage(int a){
        age =a;
    }

class subase extends base{
    String Name;
    int Age;
       
    public String getname(){
        return Name;
    }
    public void setname(String b){
        Name = b;
    }

    public int getage(){
        return Age;

    }
    public void setage(int c){
        Age =c;
    }
    } 
}

public class basics {
    public static void main(String[] args) {
        base b = new base();
       
        b.setname("krish dhiman");
        b.setage(19);
        System.out.println(b.getname());
        System.out.println(b.getage());

        subase d = new subase();
        d.setname("kd");
        System.out.println(d.getname());



    }
    
}
