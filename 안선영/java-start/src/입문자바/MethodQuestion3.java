package 입문자바;

import java.util.Scanner;
public class MethodQuestion3 {
    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액확인 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택 : ");
            int choice = scanner.nextInt();
            int amount;

            switch (choice) {
                case 1:
                    System.out.println("입금 액을 입력하세요: ");
                    amount = scanner.nextInt();
                    balance = depositAmount(balance, amount);
                    break;
                case 2:
                    System.out.println("출금 액을 입력하세요 : ");
                    amount = scanner.nextInt();
                    balance = withdrawAmount(balance, amount);
                case 3:
                    System.out.println("현재 잔액" + balance + "원");
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return;
                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요");

            }
        }

    }
    public static int depositAmount(int balance, int a) {
        int depositAmount = a;
        balance += depositAmount;
        System.out.println("원을 입금하였습니다. 현재 잔액" + balance + "원");

        return balance;
    }

    public static int withdrawAmount(int balance, int b) {
        int withdrawAmount = b;
        if (balance >= withdrawAmount){
            balance -= withdrawAmount;
            System.out.print(withdrawAmount + "원을 출금하였습니다. 현재 잔액 : " + balance);
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        System.out.println("최종 잔액 : " + balance + "원");

        return balance;
    }


}
