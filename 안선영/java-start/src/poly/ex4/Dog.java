package poly.ex4;

public class Dog extends AbstractAnimal {
    // 자식 메서드는 sound를 반드시 구현해야 한다.

    @Override
    public void sound() {
        System.out.println("멍멍 ");
    }

    @Override
    public void move() {
        System.out.println("개이동");

    }
}
