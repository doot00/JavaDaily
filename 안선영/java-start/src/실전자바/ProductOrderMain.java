package 실전자바;

public class ProductOrderMain {
    public static void main(String[] args) {

        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder first = new ProductOrder();
        first.productName = "두부";
        first.price = 2000;
        first.quantity = 2;
        orders[0] = first;

        ProductOrder second = new ProductOrder();
        second.productName = "김치";
        second.price = 5000;
        second.quantity = 1;
        orders[1] = second;

        ProductOrder thrid = new ProductOrder();
        thrid.productName = "콜라";
        thrid.price = 1500;
        thrid.quantity = 2;
        orders[2] = thrid;

        int sum = 0;
        for (int i = 0; i< orders.length; i++){
            ProductOrder s = orders[i];
            System.out.println("상품명: " + s.productName + ", 가격: " + s.price + ", 수량: " + s.quantity);
            sum += (s.price * s.quantity);
            System.out.println("총 결제 금액: " + sum);
        }
        // 메서드를 포함하여 여러 상품의 주문 정보를 배열로 관리
        // 정보를 출력, 최종 결제 금액을 계산하여 출력한다.



    }
    public static class ProductOrder {
        String productName;
        int price;
        int quantity;
    }
}
