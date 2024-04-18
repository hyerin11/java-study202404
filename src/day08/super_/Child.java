package day08.super_;

public class Child extends Parent{

//    int a;
//    double b;
    boolean c;

    Child() {
        //super(); //자동으로 생성됨. 안보여서 그렇지.. 근데 this()가 있으니까 여기에는 안생김.
        this(100); //아래의 x를 가지고 옴.
        System.out.println("Child 클래스의 생성자 호출!");
        this.c = true;
    }
    Child(int x){
        super(); //나의 부모 클래스의 생성자를 호출해라. 그래서 parent클래스 생성자 호출!이 실행되는 것 임.
        System.out.println("Child 클래스의 2번째 생성자 호출");

    }

    void childMethod() {
        System.out.println("child a = " + this.a);
        System.out.println("child b = " + this.b);
        System.out.println("child c = " + this.c);
    }
}
