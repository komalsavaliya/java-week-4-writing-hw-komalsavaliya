package programme_23_method_overriding;

public class Bike extends Vehicle {
    //Defining the same method as in the parent class
    public void run(){
        System.out.println("Bike is running safely");
    }
    public static void main(String[]args){
        Bike obj = new Bike();//creating Object
        obj.run();//Calling method
    }
}
