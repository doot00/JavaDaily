package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        // final reference와 관련된 것이다.
        final Data data = new Data(); // 참조형을 final로 하였기 떄문에 참조 대상을 변경할 수 없다.

        // 참조 대상의 값은 변경 가능
        data.value = 10; // final이 아니라 인스턴스에 있는 것이다. 참조하는 대상의 값은 변경할 수 있다.
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);

        // 참조형 변수 data에 final이 붙었다. 변수 선언 시점에 참조값을 할당했으므로 더는 참조값을 변경할 수 없다.

    }
}
