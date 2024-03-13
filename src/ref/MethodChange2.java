package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메소드 호출 전: dataA.value = " + dataA.value); //10
        changeReference(dataA);
        System.out.println("메소드 호출 후: dataA.value = " + dataA.value); //20
    }

    /** 참조값을 복사하는 것. 그 참조 값에 들어있는 값을 바꿨기에 메소드 호출 후에는 20으로 변경된 값이 출력됨. **/
    private static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}
