package 입문자바;

public class Arrangement2 {

    public static void main(String[] args) {
        //배열 변수 선언
        int[][] arr = new int[3][3];

        int i = 1;
        for(int row = 0; row<arr.length; row++){
            for(int column = 0; column<arr[row].length; column++){
                arr[row][column] = i++;
            }
        }

        for(int row=0; row<arr.length; row++){
            for(int column =0; column< arr[row].length; column++){
                System.out.print(arr[row][column] + " "); // 0열을 출력하는 것이다.
            }
            System.out.println();
        }
    }
}
