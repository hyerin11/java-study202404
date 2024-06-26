package day04;

//class : 객체를 찍어내는 설계도
//라이브러리 클래스 : 설계도의 역할을 하며 실행은 안한다. 그렇기 때문에 main이 없다.
//설계도만 여기다 그리고, 실행은 다른 곳에다 만듦.
public class Dancer {

        //클래스에서는 객체의 속성과 기능을 정의
        //객체의 속성 : 객체를 표현하는 데이터
        // -> 필드(field)
    String dancerName; // 댄서 이름 (변수가 아니라 필드임. 함수 안에 있는 것만 변수)
    String crewName; // 팀 이름
    String genre; // 장르
    int danceLevel; // 0:초보 1:아마추어 2:프로


    //객체의 기능 : 객체가 할 수 있는 일 , 행위
    //-> 메서드(method), static을 붙이지 않는다.

    //자기소개 기능 (이것도 함수 아니고, 메서드. 댄서여야지만 사용할 수 있기 때문에 메서드.)
    void introduce(){
        System.out.println("이름: "+ dancerName);
        System.out.println("팀명: "+ crewName);
        System.out.println("장르: "+ genre);
        System.out.println("레벨: "+ danceLevel);
    }

    //춤 추는 기능
    void dance(){
        System.out.printf("%s 댄서가 %s 춤을 춥니다.\n", dancerName, genre);
    }

    //생성자(constructor)
    //객체가 생성될 때의 초기 값을 세팅해주는 함수의 일종
    //규칙1)생성자는 함수의 일종이기에 반드시 이름이 클래스 이름과 같아야 한다.
    //규칙2)생성자는 리턴값이 없다. 따라서 void가 생략된다⭐⭐
    Dancer(){
        dancerName = "춤꾼";
        crewName = "팝핀";
        genre = "케이팝";
        danceLevel = 2;
    }

    //생성자는 여러개 만들 수 있다. : 생성자 오버로딩
    //규칙) 파라미터가 달라야 한다.
    Dancer(String dName){
        dancerName = dName;
        crewName = "얼렁뚱땅";
        genre = "어쩌구";
        danceLevel = 2;
    }
    Dancer(String dName, String cName){
        dancerName = dName;
        crewName = cName;
        genre = "케이팝";
        danceLevel = 2;
    }

    Dancer(String dName, String cName, String gName){
        dancerName = dName;
        crewName = cName;
        genre = gName;
        danceLevel = 1;
    }
}
