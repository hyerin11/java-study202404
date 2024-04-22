package day08.singleton;

public class Main {
    public static void main(String[] args) {
        MyPet m1 = MyPet.getInstance();
        MyPet m2 = MyPet.getInstance();
        MyPet m3 = MyPet.getInstance();
        //만들어둔 객체 1개만 가져다 쓸 수만 있음. 그래서 주소가 다 똑같다

        System.out.println("m1 = " + m1);
        System.out.println("m2 = " + m2);
        System.out.println("m3 = " + m3);

        m1.setName("초코");

        //객체가 하나를 다 바라보고 있으니까 전부 초코.
        m1.introduce();
        m2.introduce();
        m3.introduce();
    }
}
