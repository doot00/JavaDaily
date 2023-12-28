package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    // todo 나머지 코드를 완성하라.
    public void addItem(Item item){
        // 검증로직
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        // 정상로직
        items[itemCount] = item; // 아이템을 0번에 넣고
        itemCount++; // 증가시킨다.

    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        // 출력하는 내용
        for (int i = 0; i < itemCount; i++){
            Item item = items[i];

            System.out.println("상품명" + item.getName() + " 합계:" + item.getTotalPrice());
        }
        System.out.println("전체 가격 합 : " + calculateTotalPrice());

    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i< itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }


}


