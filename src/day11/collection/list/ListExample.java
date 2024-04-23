package day11.collection.list;

import day05.StringList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        //배열 만들 필요없이 바로 사용 가능
        String[] foodList2 = new String[0];
        StringList foodList = new StringList();
        
        //배열 방 늘리고, 줄이고 귀찮으니 아래처러 쓰면 됨
        List<String> foods = new ArrayList<>();
        foods.add("짜장면");
        foods.add("짬뽕");
        foods.add("볶음밥");
        foods.add("케이크");

        System.out.println(foods);

        //중간 삽입 add(index, E)
       foods.add(1, "탕수육");
        System.out.println(foods);


        //length 대신 size
        int size = foods.size();
        System.out.println("size = " + size);

        //짜장면이 몇 번째 인덱스에 있는지
        int index = foods.indexOf("짜장면");
        System.out.println("index = " + index);
        
        
        //있는지 없는지 알려줄 때
        boolean flag = foods.contains("탕수육");
        System.out.println("flag = " + flag);


        //삭제할 때
        foods.remove(0);//0번 삭제할 때
        foods.remove("탕수육"); //탕수육 찾아서 삭제
        System.out.println(foods);


        //수정할 떄
        foods.set(0, "마라탕");
        System.out.println(foods);
        
        //가져올 때
        String s = foods.get(1); //foods[1] 줘
        System.out.println("s = " + s);
        
        //반복문 처리
        for (int i = 0; i < foods.size(); i++) {
            System.out.println(foods.get(i)+"배고파");
        }
        System.out.println("=============");
        //순회처리
        for(String food : foods){
            System.out.println(food+"JMT");
        }

        //전부 삭제
        foods.clear();
        System.out.println(foods);

        //비었다면 true
        System.out.println(foods.isEmpty());

        //리스트에 초기값 넣고 시작하기
        int[] arr = {10, 20, 30};
        List<Integer> numbers = new ArrayList<>(List.of(10, 77, 33, 19, 20, 66, 30));
        System.out.println("numbers = " + numbers);
        
        //오름차순 정렬
        numbers.sort(Integer::compareTo);
        System.out.println("numbers = " + numbers);

        //내림차순 정렬
        numbers.sort(Comparator.reverseOrder());
        System.out.println("numbers = " + numbers);
        

    }
}
