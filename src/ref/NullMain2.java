package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; //NullPointerException 발생 (null에 .을 찍음 : 참조할 값이 없음)
        System.out.println("data = " + data.value);
    }
}
