package Homework;

import java.util.Scanner;

public class MainBankClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
  BankAccount bankAccount=new BankAccount(0);
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
                    try {
                        bankAccount.setAmount(bankAccount.withDraw((int) bankAccount.getAmount()));
                    }catch (LimitException e){
                        System.out.println(e.getMessage()+e.getRemainingAmount());
                        bankAccount.setAmount(bankAccount.getAmount()-e.getRemainingAmount());
                        System.out.println("Вы успешно сняли "+e.getRemainingAmount()+". Остаток "+bankAccount.getAmount());
                    break;
                    }
                }
            }
            case 3->System.exit(0);
        }
        }
}
}
