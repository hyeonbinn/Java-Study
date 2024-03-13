package ref;

import java.sql.Struct;

public class Method2 {
    public static void main(String[] args) {

        Student student1 = createStudent( "학생1", 15, 90);
        Student student2 = createStudent("학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);

    }

    /** 더 간단히 만들어보자 ~!
        createStudent() 라는 메서드를 만들고 객체를 생성하는 부분도 이 메서드안에 함께 포함.
        이제 이 메서드 하나로 객체의 생성과 초기값 설정을 모두 처리 **/
    static Student createStudent(String name, int age, int grade) { //메서드 안에서 객체를 생성했기 때문에 만들어진 객체를 메서드 밖에서 사용할 수 있게 돌려주어야 함(return)
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.name + " 성적: " + student.grade);
    }
}
