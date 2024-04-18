package day08.final_;

class Child extends Parent{
    @Override
    void sing(){
        System.out.println("라라라ㅏㄹ라랄");
    }
}
//전체 상속 불가하게 하려면  클래에서 붙일 수도 있다.
public class Parent { //상속 불가
    
    void sing(){
            System.out.println("노래 랄랄라");
    }
    public final void dance(){
        System.out.println("댄스 룰룰루");
    }
    
}
