package ref;


public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();

        /** NullMain3에서 발생한 NullPointerException 해결 : 참조하는 값을 주면 됨.**/
        bigData.data = new Data();

        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        //NullPointerException 발생
        System.out.println("bigData.data.value" + bigData.data.value);
    }
}
