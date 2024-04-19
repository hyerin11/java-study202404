package day09.poly.casting;

public class Main {
    public static void main(String[] args) {

        Child child = new Child();
        child.c1 = 100;
        child.p1 = 200; //부모의 p를 상속해옴.

        child.method1(); //새롭게 오버라이딩 한 child가 나옴.
        child.method2(); //method2

        Parent parent = new Parent();
        parent.p1 = 500;
        parent.method1();//Parent의 method1


        Child castingChild = new Child();
        //Parent castingChild = new Child(); //부모로 바꾸니까 예전에 자식이였을 때 가능했던 본연의 모습은 실행이 안됨.
        castingChild.p1 = 100;
        castingChild.c1 = 300;
        castingChild.method1();
        castingChild.method2();

        Parent[] pArr = {castingChild};
        Parent pp = castingChild;

    }
}
