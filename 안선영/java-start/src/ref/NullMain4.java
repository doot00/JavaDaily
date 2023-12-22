package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); // 참조값을 주어서 데이터를 넣어준다.
        System.out.println("bigData.count= " + bigData.count);
        System.out.println("bigData.data= " + bigData.data);

        // data는 참조형이기 때문에 null이 된다. 
        // bitData.data.value는 data의 null값을 참조하기 때문에 에러가 발생한다
        System.out.println("bigData.data.value" + bigData.data.value);

        
    }
}
