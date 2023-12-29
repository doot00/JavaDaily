package static1;

public class Data2 {
    public String name;

    public Data2(String name, Counter counter){
        this.name = name;
        counter.count++; // counter 인스턴스에 있는 값을 누적해서 올려주기 때문에
    }
}
