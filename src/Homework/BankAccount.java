package Homework;

import java.util.Scanner;

public class BankAccount {
    private double amount;
    Scanner scanner=new Scanner(System.in);
    public BankAccount(double amount) {
        this.amount = amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {

        return amount;
    }
    public double deposit(double sum){
        System.out.println("Сколько сомов Вы хотите добавить?");
        double deposit=scanner.nextInt();
        sum+=deposit;
        System.out.println("Вы успешно добавили "+deposit+" сомов. Доступная сумма: "+sum);
    return sum;
    }
    public double withDraw(int sum)  {
        System.out.println("Введите требуемую сумму:");
        int withDraw=scanner.nextInt();
        if(sum<withDraw){
            try {
                throw new LimitException("Не хватает средств. Доступная сумма: ",sum);
            } catch (LimitException e) {
                System.out.println(e.getMessage() + e.getRemainingAmount());
            sum-=e.getRemainingAmount();
                System.out.println("Остаток: "+sum);
            }
        }else
        sum-=withDraw;
        return sum;
    }
}
