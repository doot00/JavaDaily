package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // 같은 패키지 default 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        // private 호출 불가
//        data.privateField = 3;
//        data.privateMethod(); // 컴파일 에러가 발생한다.

        data.innerAccess(); // public 메서드이기 때문에 아무곳에서 호출이 가능하다.

    }
}
