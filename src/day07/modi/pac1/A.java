package day07.modi.pac1;

public class A {

    //필드
    public int f1;
    int f2; //default 제한한다
    private int f3;

    //메서드
    public void m1() {}
    void m2() {} // default 제한한다
    private void m3() {}

    //생성자 - 클래스 이름이랑 똑같이 만들어야 함
    public A(int a) {}
    A(double b) {}
    private A(boolean c) {}

    //테스트 메서드 - 같은 클래스 안에서는 public, private 등 제한이 다 필요없다. (우리반끼리는 상관없음!)
    void test(){
        this.f1 = 10;
        this.f2 = 10;
        this.f3 = 10;

        m1();
        m2();
        m3();

        //같은 클래스 안에서는 어떠한 제한자가 붙어도 다 사용 가능
        new A(10); //public
        new A(5.55); //default
        new A(false); //private
    }


}
