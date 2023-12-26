package OOP1;

public class ValueDataObjectMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        valueData.add();
        valueData.add();
        valueData.add(); // x002에 있는 add로 이동한다. add호출을 통해 value값을 증가시킨다.
        System.out.println("최종 숫자=" + valueData.value);
    }
}
