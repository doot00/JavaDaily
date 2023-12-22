package ref;

public class Method2 {
    public static void main(String[] args) {
        // 깔끔해진 코드를 볼 수 있다.
        Student student1 = createStudent("학생1", 15, 90);
        Student student2 = createStudent("학생2", 16, 80);

        // 메서드를 만들어서 참조값을 넘겨서 받을 수 있다.
        printStudent(student1);
        printStudent(student2);
    }
    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
        // 만들어진 값을 대입을 하고, 밖에서 사용할 수 있게 하도록 return을 해준다.
    }

    static void printStudent(Student student) {
        System.out.println("이름 : " + student.name + " 나이 : " + student.age + " 성적 : " + student.grade);
    }
}

