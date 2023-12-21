//import java.util.Scanner;
public class Method1 {
    public static void main(String[] args) {
        int sum1 = add(5, 10);
        System.out.println("결과 출력" + sum1);

        System.out.println("==============");

        // 계산 2
        int sum2 = add(15, 20);
        System.out.println("결과 출력 " + sum2);

    }
    // add 메서드를 만드는 방법이다.
    public static int add(int a, int b) {
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a * b;
        return sum;

    }
}
