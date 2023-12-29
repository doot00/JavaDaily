package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A"); // 걍하기가 싫네..
        System.out.println("A count = " + Data3.count);
        // Data3.count가 되는 이유
        Data3 data2 = new Data3("B"); // 걍하기가 싫네..
        System.out.println("B count = " + Data3.count);
        // Data3.count가 되는 이유
        Data3 data3 = new Data3("C"); // 걍하기가 싫네..
        System.out.println("C count = " + Data3.count);
        // Data3.count가 되는 이유

        // 인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(Data3.count); // 권장하지 않는다. count가 인스턴스 변수인가 라는 생각이 든다.
        // 클래스를 통한 접근
        System.out.println(Data3.count); // static 변수라는 생각이 든다.



    }
}
