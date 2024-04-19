package day09.poly;

public class Basic {

    class A {}
    class B extends A {}
    class C extends A {}
    class D extends B {}
    class E extends C {}


    //다영성 : 객체가 여러 타입을 사용할 수 있다.
    // 부모의 타입을 사용 가능
    void test() {
        A x1 = new A();
        A x2 = new B();
        A x3 = new C();

        B x4 = new D();
        C x5 = new E();


        int a = 10;
        double b = (double) a;

        C c = new C();
        A d = (A) c;


    }


}
/*
            OBJECT
              |
*             A
*          /     |
*         B       C
* *     /           |
 *     D             E
*
*
*
* */

