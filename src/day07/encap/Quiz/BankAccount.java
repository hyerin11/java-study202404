package day07.encap.Quiz;


//1. 은행 계좌 클래스 만들기
//
//은행 계좌를 관리하는 BankAccount 클래스를 만드세요.
//계좌 잔액(balance), 계좌 번호(accountNumber), 계좌 주인의 이름(accountHolder) 필드를 private로 선언하세요.
//잔액 조회, 입금, 출금 메소드를 public으로 만들어 외부에서 접근할 수 있게 하세요.
//출금 메소드는 잔액이 출금하려는 금액보다 클 때만 돈을 출금할 수 있도록 하세요.


public class BankAccount {

    private long balance; //계좌 정보
    private String accountNumber; //계좌 번호
    private String accountHolder; //계좌 주인의 이름

    public BankAccount(String accountNumber, String accountHolder, long balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    //계좌 정보
    public long getBalance(){
        return balance;
    }

    //입금
    public void deposit(int money) {
        if(money>0){
            balance+=money;
            System.out.println(money + "원을 입금했습니다.");
            System.out.println("현재 잔액은 " + balance + "입니다.");
        }else{
            System.out.println("0원 이상 입금해주세요");
        }
    }
    //출금
    public void withdraw(int money) {
        if(money<0){
            System.out.println("0원 이상 입력해주세요");
            return;
        }else if(balance>money){
            balance-=money;
            System.out.println(money + "원을 출금합니다.");
            System.out.println("현재 잔액 : " + balance);
        }else{
            System.out.println("잔액이 부족합니다");
            return;
        }
    }
}
