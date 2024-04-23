package day11.api.lang;

public class SystemExample {
    public static void main(String[] args) {

        //프로그램 실행시간 체크할 때
        long start = System.currentTimeMillis(); //1970년 1월 1일 자정부터 몇 초가 지났는지 알려줌.
        System.out.println("start = " + start);

        String s = "";
        for(int i=0; i<100000; i++){
            s+="abc";
        }
        long end = System.currentTimeMillis();
        long time = end-start;
        System.out.println("time = " + time/1000.0 + "초");

        

    }
}
