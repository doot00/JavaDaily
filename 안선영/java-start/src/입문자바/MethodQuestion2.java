package 입문자바;

import java.util.Scanner;
public class MethodQuestion2 {

    // balance 값을 일일히 지정하지 말고 main에서 한번에 지정할것.
    public static void main(String[] args) {
        int balance = 10000;
        balance = depositAmount(balance, 1000);
        balance = withdrawAmount(balance, 2000);

        System.out.println("최종 잔액 : " + balance + "원");
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
