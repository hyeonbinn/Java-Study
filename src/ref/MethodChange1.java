package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메소드 호출 전: a = " + a); //10
        changePrimitive(a);
        System.out.println("메소드 호출 후: a = " + a); //10
    }

    /** 메서드 안에서 x = 20 으로 새로운 값을 대입
        결과적으로 x 의 값만 20 으로 변경되고, a 의 값은 10 으로 유지 **/
    private static void changePrimitive(int x) {
        x = 20; //x가 넘어오면 20으로 바꿔줌.
    }
}
