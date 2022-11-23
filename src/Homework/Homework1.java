package Homework;

public class Homework1 {
    public static void main(String[] args) {
        Profession[] profession=new Profession[4];
        profession[0]=new Profession("Director");
        profession[1]=new Profession("Manager");
        profession[2]=new Profession("Architect");
        profession[3]=new Profession("Businessman");
 Grandpa grandpa=new Grandpa("Ibraim",93,profession[0],HabitEnum.EARLY);
 Father father1=new Father("Kubanychbek",63,profession[1],HabitEnum.HARDWORKING);
 Son son1=new Son("Sanzhar",37,profession[3],HabitEnum.LATE);
 Son son2=new Son("Bakyt",26,profession[2],HabitEnum.HARDWORKING);
        System.out.println("grandfather\n"+grandpa.getInfo());
        System.out.println("------------------------");
        System.out.println("father\n"+father1.getInfo());
        System.out.println("------------------------");
        System.out.println("1-son\n"+son1.getInfo());
        System.out.println("------------------------");
        System.out.println("2-son\n"+son2.getInfo());
        System.out.println("------------------------");
  father1.goWork();
  father1.goWork(" 10:00");
  father1.goWork(7);
        System.out.println("---------------------");
  son1.goWork();
  son1.goWork(7);
        System.out.println("---------------------");
  son2.goWork();
  son2.goWork("11:00");
    }
}
