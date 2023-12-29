package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count = " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count =" + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count =" + counter.count);

        // data2의 인스턴스가 3개, count값도 3으로 된다.
    }
}
