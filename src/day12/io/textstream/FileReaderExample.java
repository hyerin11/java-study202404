package day12.io.textstream;

//텍스트 기반 스트림 : 텍스트 입출력에 특화된 스트림으로 2바이트 이상 데이터를 처리 가능

import day06.member.Member;
import day12.io.FileExample;
import util.SimpleInput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//✅ 바이트 기반 스트림 : OutputStream, InputStream
//✅ 텍스트 기반 스트림 : Writer, Reader
public class FileReaderExample {
    public static void main(String[] args) {
        String targetPath = FileExample.ROOT_PATH+"/hello/member.txt";

        try(FileReader fr = new FileReader(targetPath)) {

            //보조 스트림 활용
            //텍스트를 라인 단위로 읽어들이는 보조 스트림
            BufferedReader br = new BufferedReader(fr);

            //회원정보를 저장할 리스트 생성
            List<Member> memberList = new ArrayList<>();


            while (true) {
                String s = br.readLine();
                s = br.readLine();//박영희
                s = br.readLine();//고길동
                System.out.println("s = " + s); //s = 내 취미는  핸드폰하기입니다.

                String[] split = s.split(",");
                System.out.println(Arrays.toString(split)); //[abc1234@naver.com, 홍길동, 1234, 남성, 32]

                //읽어 온 회원정보로 회원 객체 생성
                Member member = new Member(
                        split[0],
                        split[2],
                        split[1],
                        split[3],
                        Integer.parseInt(split[4])
                );
               // System.out.println("member = " + member); //member = # 이름: 홍길동, 이메일: abc1234@naver.com, 나이: 32세, 성별: 남성, 가입일: 2024-04-24
                memberList.add(member);
            }
//            int read = fr.read();
//            System.out.println("read = " + (char)read); //read = 내
//            read = fr.read();
//            System.out.println("read = " + (char)read); //read =
//            read = fr.read();
//            System.out.println("read = " + (char)read); //read = 취


            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }