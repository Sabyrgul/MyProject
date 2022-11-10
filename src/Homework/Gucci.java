package Homework;

public class Gucci extends FashionHouse{
    public Gucci(String name, String location, int year, String designer) {
        super(name, location, year, designer);
    }

    @Override
    public void print() {
        System.out.println("Name: "+getName()
        +"\nLocation: "+getLocation()
        +"\nyear: "+getYear()
        +"\nDesigner: "+getDesigner());
    }
}
