package static1;

public class Data1 {
    public String name;
    public int count;

    public Data1(String name) {
        this.name = name;
        count ++; // 생성된 객체의 수를 세어야 한다. 생성된 객체 수를 세는 것이다.
    }
}
