package access;

public class BankAccount {

    private int balance;

    // generate 단축키를 사용하면 생성자를 자동으로 만들어준다. -> Constructor alt+insert를 사용한다.

    // public 메서드 : deposit
    public void deposit(int amount) {
        if(isAmountValid(amount)){
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0){
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    // public 메서드: getBalance
    public int getBalance() {
        return balance;
    }

    // 내부에서 사용하기 때문에 private를 사용하였다.
    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야 한다.
        return amount > 0;
    }
}

