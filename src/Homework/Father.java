package Homework;

public class Father extends Grandpa {


    public Father(String name, int age, Profession profession, HabitEnum habitEnum) {
        super(name, age, profession, habitEnum);
    }

    public void goWork(){
        System.out.println(getName()+" goes to work at 09:00");
    }
    public void goWork(String startWork){
        System.out.println("Today is Saturday, so he goes to work at "+startWork);
    }
    public final void goWork(int weekend){
        if(weekend==7) System.out.println("It is Sunday, he is at home");
    }
    @Override
    public String getInfo() {
        return "name: "+getName()+
                "\nage: "+getAge()+
                "\nprofession: "+getProfession().getProfession()+
                "\nhabit: "+getHabitEnum();
    }
}
