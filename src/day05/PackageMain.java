package day05;
//다른 패키지에 있는 클래스를 로딩할 때 이름을 축약해서 쓰기 위해 사용
//import day05.Juice.Apple;
//import day05.Juice.Banana;
//import day05.Juice.Peach;
import day05.Juice.*; //전부 가져올꺼야!

public class PackageMain {
    public static void main(String[] args) {
        //day05.fruit.Apple a1= new day05.fruit.Apple();//fruit 패키지의 사과입니다.
        Apple a1 = new Apple();
        new Banana();
        new Peach();

        //동시에 부를 때는 두개 다 전부 다 써줘야 함.
        day05.fruit.Apple a2 = new day05.fruit.Apple();
        day05.fruit.Apple a3 = new day05.fruit.Apple();

        //원래는 스캐너도 이렇게 써주는게 맞음. 근데 귀찮으니까 위로 빼버린거
        //java.util.Scanner sc = new java.util.Scanner(System.in);
    }
}
