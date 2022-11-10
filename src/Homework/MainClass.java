package Homework;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Printable[] printable=new FashionHouse[4];
        String className=null;
        for(int i=0;i<printable.length;i++) {
            System.out.println("What fashion house are you looking for?  ");
       className=scanner.next();
       printable[i]=createObject(className);
            System.out.println("You have successfully added: ");
   printable[i].print();
        }
    }

    private static FashionHouse createObject(String className) {
        switch (className){
            case "Gucci" -> {
                return new Gucci("Gucci","Aosta, Italy",1921,"Guccio Gucci");
            }
            case "Versace" ->{
                return new Versace("Versace", "Milan, Italy",1978,"Gianni Versace");
            }
            case "LouisVuitton" ->{
                return new LouisVuitton("LouisVuitton","Paris, France",1854," Louis Vuitton");
            }
            case "Dior" ->{
                return new Dior("Dior","Paris, France",1946,"Christian Dior");
            }
        }
        return null;
    }
}
