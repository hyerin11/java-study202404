package day04;

public class Dog {

    // 필드: 객체의 속성
    String dogName;
    int age;
    boolean injection; // 예방접종 유무

    // 메서드: 객체의 기능
    void petInfo() {
        System.out.printf("우리집 강아지는 %s에요! %d살이에요!\n", dogName, age);
        if (injection) {
            System.out.println("예방접종을 했어요!");
        } else {
            System.out.println("아직 예방접종을 안했어요!");
        }
    }
    void inject() {
        System.out.printf("%s 강아지에게 주사를 맞혀요!\n", dogName);
        //위에서 만든 함수를 참조한거니까 필드
        injection = true;
        //함수 안에서 만들었으니까 지역변수
        double d = 3.3;
    }

    Dog(){
        System.out.println("1번 생성자 호출");
    }


    // 생성자
    Dog(String dName) {
        System.out.println("2번 생성자 호출");
        dogName = dName;
        age = 1;
    }
}
