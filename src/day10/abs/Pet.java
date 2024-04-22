package day10.abs;

public abstract class Pet {


    String name;
    int age;
    String kind;


    //밥과 잠 기능은 필수기능이므로 없다면 객체가 불안정해지므로 강요할 필요가 있는 것은 추상화한다.
    public abstract void eat(); //이름만 제공한다 = 추상화시킨다
    public abstract void sleep();

    //산책 기능은 필요한 객체에 따라 오버라이딩하는 것이지 모두에게 강요할 필요가 없으므로 추상화하지 않는다
    public void walk() {};



    //추상메서드는 본문이 없는 껍데기 역할
    //(자식들에게 기능 이름을 통일시키기 위한 장치)로만 사용되며
    //추상 메서드는 추상 클래스 안에서만 선언 가능하다.
    //다만 추상 클래스 내부에는 추상 메서드 이외 모든 메서드 선언 가능



}
