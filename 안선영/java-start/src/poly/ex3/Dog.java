package poly.ex3;

public class Dog extends AbstractAnimal{
    // 자식 메서드는 sound    를 반드시 구현해야 한다.

    @Override
    public void sound() {
        System.out.println("멍멍 ");
    }
}
