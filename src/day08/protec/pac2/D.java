package day08.protec.pac2;

import day08.protec.pac1.A;

public class D extends A {
    D() {
        super(100);//public A의 괄호

        super.f1 = 100;
        //super.f2 = 100;

        m1();
        //m2();
    }

//    viod test(){
//        A a = new A();
//        //f1 = 10; //f2=30;
//       // m1(); //m2();
//    }



}
