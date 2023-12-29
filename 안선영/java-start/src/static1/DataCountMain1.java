package static1;

import static1.Data1;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A count = " + data1.count);
        // 카운터가 0 이었다가 1 새로 만들어진다.

        Data1 data2 = new Data1("B");
        System.out.println("A count = " + data2.count);

        // 값은 인스턴스끼리 서로 공유되지 않는다. 원하는 답을 구할 수 없다.
        Data1 data3 = new Data1("C");
        System.out.println("A count = " + data3.count);

    }
}
