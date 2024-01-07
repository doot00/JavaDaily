package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child();

        //단 자신의 기능은 호출할 수 없다.
        //poly.childMethod();

        //다운 캐스팅 (부모 타입 -> 자식 타입)
        Child child = (Child)poly; // Parent 타입을 강제로 child로 바꿔서 호출이 가능하다.
        child.childMethod();

        // 일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅 -> 연산자 우선순위가 애매할 땐 괄호를 사용한다.
        ((Child) poly).childMethod();

    }
}
