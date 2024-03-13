package ref;

public class NullMain1 {
    public static void main(String[] args) {

        Data data = null; //null값 할당
        System.out.println("1. data = " + data);

        data = new Data(); //새로운 Data 객체 생성해 참조값 할당
        System.out.println("2. data = " + data);

        data = null; //다시 null 할당. 앞에 만든 Data 인스턴스를 더는 참조하지 않음
        System.out.println("3. data = " + data);
    }
}
