package day10.abs;

public class Dog extends Pet{
//    String name;
//    int age;
//    String kind;

    @Override
    public void eat(){
        System.out.println("강아지는 밥을 먹어요");
    }

    @Override
    public void sleep(){
        System.out.println("강아지는 마당에서 낮잠을 자요");
    }

    public void walk(){
        System.out.println("산책해요");
    }
}
