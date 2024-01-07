package poly.basic;

//upcasting vs downcasting
public class CastingMain3 {
    public static void main(String[] args) {


        Child child = new Child();
        Parent parent1 = (Parent) child; // 부모는 자식을 담을 수 있다. 업캐스팅은 생략이 가능하다. 생략 권장.
        Parent parent2 = child; // 업캐스팅 생략 가능하다.

        parent1.parentMethod();
        parent2.parentMethod();

        // Child 타입을 Parent 타입에 대입해야 한다. 부모 타입으로 변환하는 경우 다음과 같이 캐스팅 코드(타입)을 생략할 수 있다.
        // 업캐스팅은 생략이 가능하다. -> 다운캐스팅은 생략이 불가능 한것 .
        //
    }

}
