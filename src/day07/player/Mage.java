package day07.player;

public class Mage extends Player {

    int mana;

    public Mage(String nickName) {
//        this.nickname = nickName;
//        this.level = 1;
//        this.hp = 50;
        super(nickName);
        this.mana = 100;
    }

    public void showStatus() {
        super.showStatus();
        System.out.println("# mana: " + this.mana);
    }

    public void thunderbolt(Mage... targets) {

    }

//썬더볼트는 여러 플레이어를 대상으로 공격하는 스킬
//1. 자기 자신이 대상이 되면 자신은 피해입지 않는다
//2. 타겟이 된 대상은 10~15의 랜덤 피해를 입고 실제 체력이 감소한다

//    m.thunderbolt(w, h, m,
//            new Mage("토끼"),
//        new Warrior("딸기")
//    );




}
