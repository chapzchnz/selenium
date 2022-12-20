package co.edureka.selenium;

abstract class Birds implements Animal{

    abstract public void speak();

    @Override
    public void eat() {
        System.out.println("Birds, eat is called");
    }



}
