package day10.abs;

public class Main {

    public static void main(String[] args) {

        //new Pet(); //Pet'은(는) abstract이며, 인스턴스화할 수 없습니다
        //Pet은 타입만 제공할 것 이다.

        Dog myDog = new Dog();
        Dog myDog2 = new Dog();
        Dog myDog3 = new Dog();
        Cat myCat = new Cat();

        GoldFish goldFish = new GoldFish();


        myDog.eat();
        myCat.sleep();
        //각각 자는 기능의 이름이 다르니까 헷갈림 => 추상화의 필요성

        Pet[] petList = {myDog, myDog2, myDog3, myCat};

        for(Pet pet : petList){
            pet.eat();
            }

        }

    }

