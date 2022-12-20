package co.edureka.selenium;

public class Crow extends Birds{

    @Override
    public void speak() {
        System.out.println("Crow's speak is called");
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("Crow's eat is called");
    }

    public void wings(int wingsCount){
        System.out.println("Wings Count "+ wingsCount);
    }
}
