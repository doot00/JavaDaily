package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s); // 클래스를 통해 바로 불러올 수 있다. 붕어빵 틀을 바로 불러오는 것이다.

        System.out.println("before: " + s);
        System.out.println("after: " + deco);

    }
}
