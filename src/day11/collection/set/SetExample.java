package day11.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        //중복저장 허용하지 않으며, 순서가 없어 비교적 빠른 저장 속도를 보여준다.
        Set<String> set = new HashSet<>();
        
        boolean flag1 = set.add("김말이");
        set.add("닭꼬치");
        set.add("단무지");
        boolean flag2 = set.add("김말이");
        set.add("김밥");

        System.out.println("set = " + set); //set = [김밥, 김말이, 단무지, 닭꼬치]
        System.out.println("flag1 = " + flag1); //true
        System.out.println("flag2 = " + flag2); //false

        //갯수
        System.out.println(set.size()); //4

        //탐색시에는 개별 탐색은 불가, 전체 탐색 가능(인덱스가 없어서)
        for(String s : set){
            System.out.println("s = "+ s);
        }

        //삭제할 떄, 인덱스가 없으니까 직접적으로 입력해줘야 함.
        set.remove("단무지");
        System.out.println("set = " + set);
        //set은 보통 데이터 중복을 빠르게 제거할 때 사용한다
        List<Integer> numbers = List.of(3, 3, 1, 2, 1, 4, 5, 6, 3, 7);

        //set으로 변환
        Set<Integer> numberSet = new HashSet<>(numbers);
        System.out.println("numberSet = " + numberSet);

        //list로 다시 변환
        numbers = new ArrayList<>(numberSet);
        System.out.println("numbers = " + numbers);
    }
}