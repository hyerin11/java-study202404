package day04;

public class FieldAndLocal {
    //힙 - 넓은공간 => 값 안썼으면 0 넣어줄게~
    //필드는 값을 초기화하지 않아도 각 타입의 기본값으로 자동 세팅
    //기본값 ===>  정수:0, 실수:0.0, 논리:false, 문자(char):' ', 나머지:null
    int aaa;

    void foo(int ccc){
        //스택 - 좁은공간(아껴야 함) => 너 왜 값 안 씀?
       int bbb = 20;

        System.out.println("aaa = " + aaa);
        System.out.println("bbb = " + bbb);
        System.out.println("ccc = " + ccc);
    }
}
