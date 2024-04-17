package day07.encap;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("그랜져");


        //필드에 접근을 풀어두면 아래에서 임의로 바꿀 수도 있음
        //myCar.model = "페라리"; >> private해서 변경할 수 없도록
        myCar.startStop();
        //myCar.start = false; >> private해서 변경할 수 없도록
        //✨속도 0~200km로만 제한!
        myCar.setSpeed(80);

        System.out.println("현재 속도: " + myCar.getSpeed() + "km/h");

        //startstop제외 다 private만 해서 접근할 수 없도록 제한함.
//        myCar.injectGasoline();
//        myCar.moveEngineOil();
//        myCar.moveCylinder();


        //변속 모드
        myCar.mode = 'X';
        System.out.println("현재 변속 모드: " + myCar.mode);

    }
}
