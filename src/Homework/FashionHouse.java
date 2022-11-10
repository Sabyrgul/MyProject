package Homework;

public abstract class FashionHouse implements Printable {
    private String name;
    private String location;
    private int year;
    private String designer;

    public FashionHouse(String name, String location, int year, String designer) {
        this.name = name;
        this.location = location;
        this.year = year;
        this.designer = designer;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getYear() {
        return year;
    }

    public String getDesigner() {
        return designer;
    }

    @Override
    public abstract void print();
}
