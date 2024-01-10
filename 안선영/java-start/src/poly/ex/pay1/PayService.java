package poly.ex.pay1;

public class PayService {
    public void processPay(String option, int amount) {

        System.out.println("결제를 시작합니다: " + option + ", amount :" + amount);

        // 결제를 수행하는 부분
        Pay pay = PayStore.findPay(option);
        boolean result = pay.pay(amount);

        // 결과를 여기에 집어넣는다.
        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }

    }

