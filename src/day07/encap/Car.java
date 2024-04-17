package day07.encap;

public class Car {
    private String model; //자동차 모델명(바꿀 수 없도록 private)
    public int speed; //현재 속도
    public char mode; //변속모드(D, N, R, P)
    private boolean start; //시동이 걸린 여부


    //생성자
    Car(String model){
        this.model = model;
        this.speed = 0;
        this.mode = 'P';
        this.start = false;
    }

    //엔진에 연료가 주입되는 기능
    private void injectGasoline(){
        System.out.println("엔진에 연료가 주입됩니다.");
    }

    //엔진오일이 순환하는 기능
    private void moveEngineOil(){
        if(start) { //시동이 켜져야
            System.out.println("엔진오일이 순환합니다.");
        } else{
            System.out.println("시동이 켜지지 않았습니다.");
            System.out.println("시동을 켜주세요!!!🔥불 나요");
        }
    }

    //엔진 내부에 있는 실린더가 작동하는 기능
    private void moveCylinder(){
        System.out.println("엔진 내부 실린더가 왕복으로 움직입니다.");
    }

    //시동 버튼을 누르는 기능 ==============================
    void startStop(){
        this.start = !this.start;
        if(start) {
            System.out.println("시동이 켜졌습니다. 운행준비를 시작합니다");
            //순서를 여기서 맞춰두고 캡슐화함. 그럼 start stop만 하면 알아서 순환됨
            injectGasoline();
            moveEngineOil();
            moveCylinder();
        }else{
            System.out.println("시동이 꺼졌습니다.");
        }
    }

    //✨현재 속도를 제한하는 메서드                 [[[set+필드명]]]
    //= setter메서드 : 필드값을 안전하게 설정하기 위한 검증로직이 포함된 메서드
    public void setSpeed(int speed){
        if(speed<0 || speed>200){
            this.speed = 0;
            this.start = false;
            this.mode = 'P';
            System.out.println("제한 속도 위반으로 시동이 꺼집니다.");
        }else{
            this.speed = speed;
        }
    }

    //현재 속도값을 가져오는 메서드                   [[[get+필드명]]]
    //getter : 정보은닉된 필드를 가져오는 대리 메서드
    public int getSpeed() {
        return speed;
    }
    
    //boolean필드의 getter는 이름 관례가 다르다      [[[is+필드명]]]
    public boolean isStart(){
        return start;
    }


    //현재 변속 모드 제한하는 메서드
    public void setMode(char mode) {
        switch (mode) {
            case 'P': case 'N': case 'D': case 'R':
                this.mode = mode;
                break;
            default:
                this.mode = 'P';
        }
    }
    public char getMode() {
        return mode;
    }

}

