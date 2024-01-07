package extends1.access.super1;

public class Child extends Parent{
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }
    public void call() {
        System.out.println("this value = " + value);
        System.out.println("super value = " + super.value);

        this.hello(); // this 생략 가능 -> 자기 자신에서 찾고, 부모요소에서 찾는다.
        super.hello();
    }

}
