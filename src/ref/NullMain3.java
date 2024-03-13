package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count); //초기값이 들어감. count 초기값 0
        System.out.println("bigData.data = " + bigData.data); //data 초기값 null

        //NullPointerException 발생
        System.out.println("bigData.data.value" + bigData.data.value); //null에 .value를 한 것
    }
}
