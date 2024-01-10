package poly.ex4;

public abstract class AbstractAnimal {
    public abstract void sound();
    // 추상 메서드는 자식 클래스가 반드시 오버라이딩 해야 한다.
    public abstract void move();// 모든 것이 다 추상 메서드가 된다.

    public void hello() {
        System.out.println("안녕하세요. 동물입니다.");
    }

}
