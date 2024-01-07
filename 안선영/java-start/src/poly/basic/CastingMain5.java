package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1); // parent의 method를 호출
        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }
    private static void call(Parent parent) {
        parent.parentMethod(); // parent method가 호출이 된다.
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent; // 다운캐스팅을 하더라도 문제가 되지 않는다.
            child.childMethod(); //
        } else {
            System.out.println("Child 인스턴스 아님");
        }
    }
}
