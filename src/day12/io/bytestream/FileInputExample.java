package day12.io.bytestream;

import day12.io.FileExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//바이트 기반(영상, 이미지, 텍스트 등 모든 데이터) 출력 스트림 예제
public class FileInputExample {


    public static void main(String[] args) {
        String message = "멍멍이는 멍멍\n야옹이는 야옹";

        try(FileInputStream fis = new FileInputStream(FileExample.ROOT_PATH + "/hello/pet.txt");){
//            int data = fis.read();//세이브 파일 생성 명령
//            System.out.println("data = " + (char)data);//h
//            data = fis.read();//세이브 파일 생성 명령
//            System.out.println("data = " + (char)data);//e => 1바이트씩 1글자 불러옴. => 반복문으로 읽어야 함.
            int data = 0;
            while((data = fis.read()) != -1){
                data = fis.read();
                //아스키코드를 문자로 출력
                System.out.write(data);
            }
            //출력 버퍼 비우기
            System.out.flush();


        }catch(FileNotFoundException e){
            System.out.println("해당 경로를 찾을 수 없습니다");
        }catch(IOException e){
            System.out.println("출력 시스템에 장애가 발생했습니다");
        }


    }


}
