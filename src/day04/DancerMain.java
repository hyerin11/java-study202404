package day04;

//실행용 클래스: 객체를 생성해서 객체의 기능을 실행시키는 곳.
//-> 실행을 위한 main이 필요
public class DancerMain {
    public static void main(String[] args) {
        //설계도(클래스)를 통해 객체를 찍어냄(생성)
        Dancer kim = new Dancer(); //한 명의 dancer를 만들었다.
        //Dancer 타입을 만들었다. string 3개와 int 1개가 들어있는.

        kim.dancerName = "김뽀또";
        kim.crewName = "치즈";
        kim.genre = "스트릿";
        kim.danceLevel = 1;

        kim.introduce();
        kim.dance();

        //두 번째 댄서==================
        Dancer park = new Dancer();
        park.dancerName = "이치즈";
        park.crewName = "츄릅";
        park.genre = "하우스키퍼";
        park.danceLevel = 2;

        park.introduce();
        park.dance();



        Dancer hong = new Dancer(); //객체를 생성할 때 딱 한번만 호출할 수 있다.✨✨
        hong.dance();//이름, 장르 등등을 앞에 지정해주지 않으면 null 댄서가 null 춤을 춥니다.라고 나온다.
        // 이것을 방지하기 위해 생성자라는 것이 있다.(기본 설정이 되어있는)
        //Dancer에서 생성자를 지정해주고 나니까, 춤꾼 댄서가 케이팝 춤을 춥니다라는 기본값이 나온다.

        Dancer choi = new Dancer("최폭풍");
        choi.dance();
        //새로운 댄서를 추가할 때 마다 기본값이 똑같음. 그리고 바꿔주기 위해서는 또 다시 지정해줘야 함.
        //그래서 파라미터에 이름을 써줄 수 있다.

        Dancer nana = new Dancer("냥", "시골크루");
        nana.dance();
        nana.introduce();
        //크루이름은 바뀔 수도 있도록 추가

        Dancer rock = new Dancer("메롱", "크롱", "락킹");
        rock.introduce();
    }
}
