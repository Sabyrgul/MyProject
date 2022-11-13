package Homework;

import java.util.Scanner;

public class MainBankClass {
    public static void main(String[] args) throws LimitException {
        Scanner scanner=new Scanner(System.in);
  BankAccount bankAccount=new BankAccount(20000);
        System.out.println("Добро пожаловать!");
        while(true){
        System.out.println("Выберите действие: "
        +"\n1. Пополнить баланс \n2. Снять с баланса \n3. Выйти");
        int choice=scanner.nextInt();
        switch (choice) {
            case 1 -> bankAccount.setAmount(bankAccount.deposit(bankAccount.getAmount()));
            case 2 -> {
                while (true) {
                    System.out.println("Остаток на счету " + bankAccount.getAmount());
                    bankAccount.setAmount(bankAccount.withDraw((int) bankAccount.getAmount()));
                    if (bankAccount.getAmount() < 6000) ;
                    if (bankAccount.getAmount() == 0) break;
                }
            }
            case 3->System.exit(0);
        }
        }
}
}
