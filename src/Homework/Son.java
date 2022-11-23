package Homework;

public class Son extends Father {
    public Son(String name, int age, Profession profession, HabitEnum habitEnum) {
        super(name, age, profession, habitEnum);
    }

    @Override
    public void goWork() {
        System.out.println(getName()+" goes to work at 09:00");
    }

    @Override
    public void goWork(String startWork) {
        System.out.println("Today is Saturday, so he goes to work at "+startWork);
    }

    @Override
    public String getInfo() {
        return "name: "+getName()+
                "\nage: "+getAge()+
                "\nprofession: "+getProfession().getProfession()+
                "\nhabit: "+getHabitEnum();
    }
}
