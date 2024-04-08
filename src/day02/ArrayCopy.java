package day02;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        String[] pets = {"강아지", "고양이", "햄스터"};
        //String[] petsCopy = pets; // 배열복사가 아닌 배열의 주소를 복사
        //배열 복사하기!
        String[] petsCopy = new String[pets.length];
        for(int i = 0; i<pets.length; i++){
            petsCopy[i] = pets[i];
        }

        pets[1] = "냥냥이"; //복사 후 원본 수정
        //카피한 후 원본에 냥냥이를 추가했지만, 카피한 배열에도 수정된 것을 볼 수 있다.

        System.out.println("pets = " + Arrays.toString(pets));
        System.out.println("petsCopy = " + Arrays.toString(petsCopy));

    }
}
