package 실전자바;

public class ClassStart2 {
    public static void main(String[] args) {
        class1 student1;
        student1 = new class1(); //변수를 통해 학생을 사용할 수 있다.
        student1.name = "학생1"; //클래스는 .을 통해 접근 가능하다.
        student1.age = 15;
        student1.grade = 90;

        class1 student2 = new class1();
        student2.name = "학생2";
        student2.age = 15;
        student2.grade = 80;

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적 : " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적 : " + student2.grade);

        // 학생(Student)라는 타입을 만들기? 클래스라는 타입을 만들 수 있다.
        // 설계도를 기반으로 메모리에 공간을 확보해서 사용하는 것이다.


    }
}
