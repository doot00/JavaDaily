package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;
    // TODO 나머지 코드를 완성할것.

    // generate 단축키를 사용하여 생성하기
    public Item (String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getTotalPrice() {
        return price * quantity;
    }

    


}
