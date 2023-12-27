package construct;

public class MemberInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        MemberInit member2 = new MemberInit();
        initMember(member1, "user1", 15, 90);
        initMember(member2, "user2", 16, 80);
        member2.name = "user2";
        member2.age = 16;
        member2.grade = 80;

        MemberInit[] members = {member1, member2};
        for (MemberInit s : members) {
            System.out.println("이름 : " + s.name + "나이 : " + s.age + "성적 : " + s.grade);
        }

    }
    // 자기 자신의 데이터를 변경하는것이 좋다.
    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
