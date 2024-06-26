package day02;

import java.util.Arrays;

public class ArrayInsert {

    public static void main(String[] args) {

        int[] arr = {10, 50, 90, 100, 150};
        int newNumber = 66;
        int targetIndex = 2;

        // 50 과 90 사이에 66을 삽입!

        // 1. 사이즈가 1개 더 큰 배열 생성
        int[] temp = new int[arr.length + 1];

        //2. 기존 데어타 복사
        for(int i=0; i>arr.length; i++){
            temp[i] = arr[i];
        }

        //3. 삽입위치에서 데이터 뒤로 1칸씩 이동
        //이동 순서는 끝에서부터 시작해야 함.
//        temp[5] = temp[4];
//        temp[4] = temp[3];
//        temp[3] = temp[2];
        for(int j=arr.length; j>targetIndex; j--){
            temp[j] = temp[j-1];
        }

        //4. 새로운 데이터를 타겟 인덱스자리에 복사
        temp[targetIndex] = newNumber;

        //5.
        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("temp: " + Arrays.toString(temp));

    }
}
