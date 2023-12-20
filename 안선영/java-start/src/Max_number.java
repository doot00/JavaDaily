import java.util.Scanner;
public class Max_number {
    public static void main(String[] args) {
        // 가장 작은 수, 큰 수 찾기
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
//        int n = scanner.nextInt();
//        // 입력받을 개수 5
//
//        int[] numbers = new int[n];
//        int minNumber, maxNumber;
//
//        System.out.println("개의 정수를 입력하세요: ");
//        for (int i =0; i<n; i++){
//            numbers[i] = scanner.nextInt();
//        }
//        minNumber = numbers[0];
//        maxNumber = numbers[0];
//        for (int i = 1; i< n; i++) {
//            if (numbers[i] < minNumber){
//                minNumber = numbers[i];
//            }
//            if (numbers[i] > maxNumber){
//                maxNumber = numbers[i];
//            }
//        }
//        System.out.println("가장 작은 정수 : " + minNumber);
//        System.out.println("가장 작은 정수 : " + maxNumber);

        // 2차원 배열 1
//        Scanner scanner = new Scanner(System.in);
//        int[][] scores = new int[4][3];
//        String[] subjects = {"국어", "영어", "수학"};
//
//        for(int i = 0; i < 4; i++) {
//            System.out.println((i+1)+ "번 학생의 성적을 입력하세요");
//            for(int j = 0; j<3; j++) {
//                System.out.print(subjects[j] + " 점수:");
//                scores[i][j] = scanner.nextInt();
//            }
//        }
//        for (int i = 0; i<4; i++) {
//            int total = 0;
//            for (int j = 0; j<3; j++){
//                total += scores[i][j];
//            }
//            double average = total / 3.0;
//            System.out.println((i+1) + "번 학생의 총점: " + total + ", 평균 : " + average);
//        }
// 학생 수를 입력받는 방법
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("학생수를 입력하세요: ");
//        int studentCount = scanner.nextInt();
//
//        int[][] scores = new int[studentCount][3];
//        String[] subjects = {"국어", "영어", "수학"};
//
//        for(int i = 0; i<studentCount; i++) {
//            System.out.println((i+1) + "번 학생의 성적을 입력하세요");
//            for(int j = 0; j<3; j++){
//                System.out.print(subjects[j] + " 점수:");
//                scores[i][j] = scanner.nextInt();
//            }
//        }
//        for (int i = 0; i<studentCount; i++) {
//            int total = 0;
//            for (int j = 0; j<3; j++){
//                total += scores[i][j];
//            }
//            double average = total / 3.0;
//            System.out.println((i+1) + "번 학생의 총점: " + total + ",평균 : " + average);
    }
}
