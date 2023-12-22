package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. Data = " + data); // null이 된다.
        data = new Data();
        System.out.println("2. Data = " + data);
        data = null;
        System.out.println("3. Data = " + data); // 마지막으로 null이 된다.


    }

}
