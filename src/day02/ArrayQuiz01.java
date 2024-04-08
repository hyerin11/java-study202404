package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01 {
    public static void main(String[] args) {
        System.out.println("# 먹고싶은 음식을 입력하세요\n# 입력을 중지하려면 <그만>이라고 입력하세요.");
        Scanner scan = new Scanner(System.in);

        String[] foodlist = {};

        while(true){
            System.out.print(">> ");
            String food = scan.nextLine();

            if(food.equals("그만")) break;

            String[] temp = new String[foodlist.length+1];
            for(int i=0; i<foodlist.length; i++){
                temp[i]=foodlist[i];
            }temp[temp.length - 1] = food;
            foodlist = temp;
            temp = null;
        }
        System.out.println("먹고싶은 리스트 : " + Arrays.toString(foodlist));

    }
}
