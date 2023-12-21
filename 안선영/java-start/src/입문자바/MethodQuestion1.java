package 입문자바;

public class MethodQuestion1 {
    public static void main(String[] args) {
        String message = "Hello, world!";
        printMessage(message, 3);
    }

    public static void printMessage(String message, int times){
        for (int i = 0; i < times; i++){
            System.out.println(message);
        }
    }
}
