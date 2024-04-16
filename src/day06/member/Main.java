package day06.member;

import util.SimpleInput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SimpleInput si = new SimpleInput();

//        Scanner sc = new Scanner(System.in);
        //회원정보를 입력받아서 회원 배열에 저장
        Member[] members = {};

        //System.out.print("이메일: ");
        //String email = sc.nextLine();

        //System.out.print("이름: ");
        //String name = sc.nextLine();


        String email = si.input("이메일 : ");
        String name = si.input("이름 : ");
        String password = si.input("패스워드 : ");
        String gender = si.input("성별 : ");
        int age = Integer.parseInt(si.input("나이 : "));

        //입력데이터를 기반으로 한 명의 회원 객체를 생성
        Member newMember = new Member(email, name, password, gender, age);
        //생성된 객체를 회원 배열에 저장
        //한 칸 늘려주고 기존 데이터 지워지고 등등 해야함. => 너무 복잡해

    }
}
