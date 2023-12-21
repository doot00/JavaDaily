public class Method2 {
    public static void main(String[] args) {
        // boolean 예제
//        boolean result = odd(2);
//        System.out.println(result);
        // Age를 check하는 예제
        //checkAge(10);
        //checkAge(20);

        // 형변환을 나타내는 문제
        double number = 1.5;
        // parsing을 해준다.

        printNumber((int)number); // 명시적 형변환을 해준다.

    }
    public static void printNumber(int n) {
        System.out.println("숫자 : " + n);
    }
//    public static boolean odd(int i) {
//        if (i % 2 == 1){
//            return true;
//        } else {
//            return false;
//        }
//        // 거짓이 되면 return을 하지 못한다. boolean은 참/거짓의 타입을 반환해야 한다 false값은 반환하지 않아서 컴파일 오류가 발생한다.
//        // 메서드는 항상 retur을 하는게 보장이 된다. 메서드를 빠져나간다.
//    }

    // Age를 체크하는 예제
//    public static void checkAge(int age) {
//        if (age < 18) {
//            System.out.println(age + "살, 미성년자는 출입이 불가능합니다.");
//            return;
//        }
//        System.out.println(age + "살, 입장하세요");
//    }
}
