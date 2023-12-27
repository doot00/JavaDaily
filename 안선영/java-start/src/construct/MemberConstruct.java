package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자이다. 대문자로 시작하고, 반환타입(void, int 등)이 없다.
    MemberConstruct(String name, int age, int grade){
        // 출력만 확인할 수 있도록
        System.out.println("생성자 호출 : " + name + ", age = " + age + ", grade = " + grade);

        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
