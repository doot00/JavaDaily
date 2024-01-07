package final1.ex;

public class Member {
    private final String id; // final 키워드를 사요
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String name) {
        // this.id = id; // 컴파일 오류가 발생한다.
        this.name = name;
    }

    public void print() {
        System.out.println("id: " + id + ", name : " + name);
    }
}
