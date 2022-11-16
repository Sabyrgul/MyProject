package Homework4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> a=new ArrayList<>();
        ArrayList<String> b=new ArrayList<>();
        ArrayList<String> c=new ArrayList<>();
        String change;
        System.out.println("Please enter first names ");
        for(int i=0;i<5;i++){
            a.add(scanner.next());
        }
        System.out.println(a);
        System.out.println("Please enter last names ");
        for (int i=0;i<5;i++){
            b.add(scanner.next());
        }
        System.out.println(b);
        for(int i=0;i<a.size();i++){
            c.add(a.get(i));
            c.add(b.get(b.size()-1-i));
        }
        System.out.println(c);
       // c.sort(Comparator.comparing());
for(int i=0;i<c.size();i++){
    for(int j=i;j<c.size();j++){
        if(c.get(i).length()>c.get(j).length()){
            change=c.get(i);
            c.set(i,c.get(j));
            c.set(j,change);
        }
    }
}
        System.out.println("Sorted list");
        System.out.println(c);
    }
}
