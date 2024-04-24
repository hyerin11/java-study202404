package day12.inner;

public class Main {

    //내부 클래스(중첩 클래스)
    //뺄셈 계산기가 필요한데 아마 이 계산기 설계도는
    //Main클래스 내부에서만 사용하고 외부에서는 사용하지 않을 것 같을 때
    public static class SubCalculator implements Calculator{

        @Override
        public int operate(int n1, int n2) {
            return n1-n2;
        }
    }

    public static void main(String[] args) {

        //new Calculator(); //interface라서 복사 못함. class가 아님.

        //Calculator addCal = new AddCalculator();
        Calculator cal;
        cal = new AddCalculator();

        int r1 = cal.operate(10, 20);
        System.out.println("r1 = " + r1);

        cal = new SubCalculator();
        int r2 = cal.operate(50, 24);
        System.out.println("r2 = " + r2);


        //익명 클래스 : 이름이 없는 클래스를 빠르게 선언하는 법
        //클래스를 통해 객체를 생성하기는 하지만 재활용은 안할 것 같을 때
        cal = new Calculator() {

            @Override
            public int operate(int n1, int n2) {
                return n1*n2;
            }
        };

        int r3 = cal.operate(10, 4);
        System.out.println("r3 = " + r3);

//        cal = new Calculator() {
//            @Override
//            public int operate(int n1, int n2) {
//                return n1/n2;
//            }
//        };

        //람다
        //사용 전체 조건) 반드시 인터페이스 안의 추상메서드가 1개여야 한다.
        cal = (n1, n2) -> n1/n2;

        int r4 = cal.operate(20, 5);
        System.out.println("r4 = " + r4);

        System.out.println("=============================");

        Restaurant fr = new FrenchRestaurant();
        Restaurant fr2 = new FrenchRestaurant();
        Restaurant fr3 = new FrenchRestaurant();


        Restaurant japaneseRestaurant = new Restaurant() {
            @Override
            public void cook() {
                System.out.println("일식 요리를 합니다");
            }


        };

        new Restaurant(){
            @Override
            public void cook() {
                System.out.println("일식 요리를 합니다.");
            }


        };
        //람다는 cook 하나만 있을 때만 사용 가능함.
        //그래서 람다를 사용할 수 있는 인터페이스인지 점검할 수 있는게 @FunctionalInterface라고 쓰면 검사할 수 있음
        //Restaurant italian = () -> System.out.println("이탈리아 요리를 합니다");



    }
}
