package day04;

public class DogMain {

    //필드임. 밖에 있으니까
    int x = 20;
    public static void main(String[] args) {
        //main 안에 만들었으니까 지역변수임.
        Dog choco = new Dog(); //1번 생성자 호출
        Dog poppy = new Dog("뽀삐"); //2번 생성자 호출

        System.out.println("choco = " + choco);//choco = day04.Dog@6cd8737
        System.out.println("poppy = " + poppy);//poppy = day04.Dog@22f71333
        //각각 주소가 다르다. 그래서 아래 뽀비.접종을 하면 뽀삐의 접종만 true라고 바뀐다. 각각 있으니까.

        choco.petInfo();
        System.out.println("=================");
        poppy.inject();//뽀삐한테 주사 맞힘
        poppy.petInfo();
    }
}
