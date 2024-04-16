package day05.player;

public class Player {

    //필드
    String nickName; //필드로 객체의 속성
    int level;
    int hp;

    //생성자 : 객체가 만들어질 때 초기에 어떤 값을 가질지를 정하는 곳
    //생성자는 생성자 내부에서 또 다들 생성자를 호출할 수 있다
    Player(String nickName){ //지역변수
        this.nickName = nickName; //this.이 붙어있으면 필드라는 것을 알 수 있다⭐
        this.level = 1;
        this.hp = 50;
    }
    Player(String nickName, int level){ //지역변수
        //this()다른 생성자를 부를 때는 생성자만 1번씨만 가능
        //그리고 가장 첫 줄에 써야 함.
        this.nickName = nickName;
        this.level = level;
        this.hp = 999;
    }

//    public Player(String "히히", int level, int hp) {
//        this(String.nickName);
//        this.level = level;
//        this.hp = 999;
//    }

    //void info(){}  -> 파라미터에 아무것도 안써있으면 자기 자신인 this가 생략되어 있는거임. 여기서 this는 자기 자신의 모습임.

    //메서드
    void attack(Player target){

        System.out.println("this = " + this);
        System.out.println("target = " + target);

        //맞은 player의 체력을 10감소
        target.hp -= 10;
        //때린 plqyer의 체력을 3감소
        this.hp -= 3; //this는 나. 나의 hp

        System.out.printf("%s님이 %s님을 공격했습니다\n", this.nickName, target.nickName);
        System.out.printf("%s님의 남은 체력: %d\n", this.nickName, this.hp);
        System.out.printf("%s님의 남은 체력: %d\n", target.nickName, target.hp);


    }

}
