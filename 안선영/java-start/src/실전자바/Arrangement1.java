package 실전자바;

public class Arrangement1 {
    public static void main(String[] args) {
        class1 student1 = new class1();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        class1 student2 = new class1();
        student2.name = "학생";
        student2.age = 16;
        student2.grade = 80;
//          1. 첫번째 선언 방법
//        class1[] students = new class1[2];
//        students[0] = student1; // 참조값이 저장되어 배열에 저장된다.
//        students[1] = student2; // 참조값을 읽고 배열에 대입한다.
        
        // 2. 두번째 선언 방법
        class1[] students = {student1, student2};

        for (int i = 0; i<students.length; i++){
            class1 s = students[i];
            System.out.println("이름 : " + s.name + "나이 : " + s.age + " 성적 : " + s.grade);
        }
        // 향상된 for문
        for (class1 s : students) {
            System.out.println("이름 : " + s.name + "나이 : " + s.age + " 성적 : " + s.grade);
        }

        // 첫번째 선언
        System.out.println("이름 : " + students[1].name + "나이 : " + students[1].age + " 성적 : " + students[1].grade);


        // 자바에서 대입은 항상 변수에 들어 있는 값을 복사해서 전달한다.


    }
}
