package day09.poly.casting;

public class Child extends Parent{

    int c1;

    @Override
    public  void method1(){//부모 것 1 오버라이딩
        System.out.println("오바라이딩 한 Child의 mhthod1");
    }


    public void method2(){
        System.out.println("Child의 method2");
    }

}
