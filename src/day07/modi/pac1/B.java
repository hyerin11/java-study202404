package day07.modi.pac1;



// 이 설계도 자체를 다른 사람이 안봤으면 좋겠어. 하고 public 빼버리면
// public을 떼버리는 것은 매우 강력함. 우리반도 잘 못봐

public class B { //클래서에는 public, default만 붙일 수 있다.

    public int z1;
    int z2;
    private int z3;

    void test(){
        A a1 = new A(50); //public
        A a2 = new A(5.55); //default
        //new A(true); //public 사용 안됨.

        a1.f1 = 20; //public
        a1.f2 = 50; //default
        //a1.f3 = 500; //private


        a1.m1();
        a1.m2();
        //a1.m3(); //private

        //C c = new C();
        //c.y1 = 10;
        //c.y2 = 20;
        //c.y3 = 30;


    }
}
