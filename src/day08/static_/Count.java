//package day08.static_;
//
//public class Count {
//    //사용 제한자(usage modifier)
//    static int x; //정적 필드 : 모든 객체가 공유한다
//    int y; //인스턴스 필드 : 각 객체별로 따로 관리한다
//
//    //정적 메서드 : 모든 객체가 공유하며 객체 생성없이 접근 가능
//    static void m1(){
//        System.out.println("static method call!!");
//        System.out.println("x(static)="+this.x);
////        System.out.println("y(static)="+this.y);
//
//        //static 메서드 내부에서는 instance필드를 직접 참조할 수 없다.
//        //static은 객체 생성없이 호출되므로 this를 가질 수 없기 때문.
//
//        //Count c3 = new Count();
//        //System.out.println("y(instance)= " + y);
//        //this.m2(); 이거도 안됨.
//    }
//    //인스턴스 메서드 : 각 객체별로 따로 실행됨
//    void m2(){
//        System.out.println("instance method call!!");
//        System.out.println("x(instance)= " + this.x);
//        System.out.println("y(instance)= " + this.y);
//        m1();
//    }
//
//
//}
