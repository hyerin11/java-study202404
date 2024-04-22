package day09.poly.car;

public class Driver {
    public void drive(Car car){ //Car로 지정해둬야 모든 기종의 차를 우전할 수 있다. Sonata car하면 소나타만 가능

        //System.out.println(car instanceof Sonata); //car가 소나타야?? >> true, false로 알려줌.

        
        String carName = "";
        if(car instanceof Sonata){
            carName = "쏘나타";
        }else if(car instanceof Tuson){
            carName = "투싼";
        }else if(car instanceof Mustang){
            carName = "머스탱";
        }
        
        
        System.out.println("운전을 시작합니다.");
        car.accelerate();
    }
}
