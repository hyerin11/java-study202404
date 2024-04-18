package day08.final_;

import java.util.SplittableRandom;

public class Student {

    String name;
    final String ssn; //주민번호
    static final String nation="대한민국"; //국적 - 대한민국이면서 + 캐나다인인.


    Student(final String ssn){
        //ssn = "23434";
        final int a = 10;
        // a = 20;
        this.ssn = ssn;

        double pi = Math.PI;


    }
//    public void setSsn(String ssn){
//        this.ssn =ssn;
//    }


}
