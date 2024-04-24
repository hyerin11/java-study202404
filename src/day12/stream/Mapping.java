package day12.stream;

import java.util.List;
import java.util.stream.Collectors;

import static day12.stream.Menu.*;

//map : 리스트에서 원하는 데이터만 추출


public class Mapping {
    public static void main(String[] args) {

        //요리 이름만 추출
        List<String> nameList = menuList
                .stream()
                .map(dish -> dish.getName())
                .collect(Collectors.toList());

        System.out.println(nameList);

        System.out.println("================");

        List<String> words = List.of(
                "safari", "chrome", "ms edge", "opera", "firefox"
        );

        List<Integer> collected = words.stream()
                .map(w->w.length())
                .collect(Collectors.toList());

        System.out.println(collected); //[6, 6, 7, 5, 7] 글자 수 출력했음


        List<Character> characterList = words.stream()
                .map(w -> w.charAt(0)) //charAt(index): 문자열에서 해당위치 글자 추출
                .collect(Collectors.toList());
        System.out.println(characterList);//[s, c, m, o, f]


        System.out.println("==============");
        //메뉴 목록에서 메뉴 이름과 칼로리를 추출해서 새로운 객체에 포장하고 싶다

        List<SimpleDish> simpleDishList = menuList
                .stream()
                .map(dish-> new SimpleDish(dish.getName(), dish.getCalories()))
                .collect(Collectors.toList());

        simpleDishList.forEach(sd -> System.out.println(sd));

    }
}
