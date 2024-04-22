package day10.exception;

public class TryExample1 {

    public static void main(String[] args) {

        int n1 = 10, n2 = 2;

        System.out.println("나눗셈 시작!");

        //예외처리(프로그램을 비정상 종료 시키지 않는 것)
        //오류가 날 것 같은 코드 찾기. ==> n1/n2
        
        try {
            int result = n1 / n2; //10나누기 0 하니까 튕김 => 예외 발생 가능성이 있는 코드
            System.out.printf("%d / %d = %d\n", n1, n2, result);

            System.out.println("나눗셈 정상 종료!");
        } catch (Exception e){
            //예외가 발생했을 경우 프로그램이 튕기면 대신 실행할 코드
            System.out.println("0으로 나눌 수 없습니다.");
        }
        
        
    }
}