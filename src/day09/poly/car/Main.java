package day09.poly.car;

import day08.protec.pac2.C;
import day08.singleton.MyPet;

public class Main {

    public static void main(String[] args) {

        Car sonata1 = new Sonata();
        Car sonata2 = new Sonata();
        Sonata sonata3 = new Sonata();

        Car tucson1 = new Tuson();
        Car tucson2 = new Tuson();

        Car mustang1 = new Mustang();
        Car mustang2 = new Mustang();
        Car mustang3 = new Mustang();
        Car mustang4 = new Mustang();

        // 다형성을 통해 이종모음 배열을 구현할 수 있음
        Car[] cArr = {sonata1, tucson1, mustang1, mustang2};
        for (Car car : cArr) {
            car.accelerate();
        }

        Object[] sArr = {"abc", "def", 100, false, new Tuson()};

        System.out.println("==============================");

        Driver driver = new Driver();
        driver.drive(new Mustang());


        Sonata mySonata = new Sonata();
        mySonata.accelerate();
        mySonata.joinSonataClub();

        Car[] cars = new Car[3];
        cars[0] = mySonata;

        System.out.println("============");

        CarShop shop = new CarShop();

        double x = 10;
        int y = (int)x;

        //객체 타입에서 다운캐스팅의 전제 조건
        //반드시 상속관계가 있어야 하면, 자식객체가 부모타입으로 업캐스팅된 것 만 내릴 수 있다
        //즉, 부모 객체를 자식 타입으로 내릴 수는 없다.
        Sonata car = (Sonata) shop.exportCar(3000);
        car.accelerate();
        car.joinSonataClub();

        System.out.println("=============");

        //부모를 자식으로 내릴 수는 없음. car를 소나타로 내릴 수 없다.
        //Sonata ccc = (Sonata) new Car();

        //Sonata ccc = (Sonata) new Mustang();

        Car ttt = new Tuson();
        Tuson tts = (Tuson) ttt; //이건 가능

    }
}
