package day09.poly.car;

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


    }
}
