package static2;

import static static2.DecoData.*;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall(); // 정적 메서드는 그냥 호출한다.

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData(); // 인스턴스는 생성을 통해 호출해야 한다.
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall(); //

        // 추가, 인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall();

        // 클래스를 통한 접근
        // 클래스 명을 적어주는 대신 alt + enter 누르면 import static이 자동으로 된다.
        // DecoData.을 생략이 가능하다.
        staticCall();
    }
}
