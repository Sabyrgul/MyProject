package Homework;

public class Grandpa {
    private String name;
    private int age;
    private Profession profession;
    private HabitEnum habitEnum;

    public Grandpa(String name, int age, Profession profession, HabitEnum habitEnum) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.habitEnum = habitEnum;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Profession getProfession() {
        return profession;
    }

    public HabitEnum getHabitEnum() {
        return habitEnum;
    }
    public String getInfo(){
        return "name: "+name+
                "\nage: "+age+
                "\nprofession: "+getProfession().getProfession()+
                "\nhabit: "+habitEnum;
    }
}
