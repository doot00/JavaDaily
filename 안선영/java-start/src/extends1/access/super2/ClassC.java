package extends1.access.super2;

public class ClassC extends ClassB{

    public ClassC() {
        super(10, 20); // 부모가 기본 생성자가 없다면 내가 직접 정의해야 한다.
        System.out.println("ClassC 생성자");
    }
}
