package construct;

public class MemberConstructMain1 {
    public static void main(String[] args) {
        // 객체를 생성과 동시에 생성자를 불러온다.
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};
        for (MemberConstruct s : members) {
            System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
        }
        


    }
}
