package day10.inter;

public interface SmartPhone {

    //인터페이스는 처음 설계부터 객체를 만들지 않겠다고 가정했으므로
    //생성자 및 필드를 선언할 수 없다. 하지만 상수는 선언이 가능하다.
    int age = 10;
    //앞에 public static final이 생략되어 있다.

    //인터페이스는 기본적으로 추상화 상태이기 때문에
    //추상화 키워드를 사용하지 않아도 된다

    //갤럭시 스마트폰 스펙 보여주는 기능
    void information();

    //충전하는 기능
    void charge();

    //카메라 기능
    void camera();
}
