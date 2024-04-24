package day12.io.bytestream;

import day12.io.FileExample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//바이트 기반(영상, 이미지, 텍스트 등 모든 데이터) 출력 스트림 예제
public class FileOutputExample {


    public static void main(String[] args) {
        String message = "멍멍이는 멍멍\n야옹이는 야옹";

        //try with resource = close가 필요한 하드웨어 접근 코드에 대해 메모리 자원 반납처리를 자동화해주는 문법


            //FileOutputStream fos = null;
        try(FileOutputStream fos = new FileOutputStream(FileExample.ROOT_PATH + "/hello/pet.txt");){
            //fos = new FileOutputStream(FileExample.ROOT_PATH + "/hello/pet.txt");
            fos.write(message.getBytes());//세이브 파일 생성 명령
        }catch(FileNotFoundException e){
            System.out.println("해당 경로를 찾을 수 없습니다");
        }catch(IOException e){
            System.out.println("출력 시스템에 장애가 발생했습니다");
        }

        //          옛날에는 이렇게 다 써줘야 했지만 다 생략하고 try with resource로 자동으로 처리해줌.

//        finally { //예외가 나도 실행, 안나도 실행되는 코드
//            System.out.println("이 코드는 무조건 실행됨!");
//
//            //파일 입출력과 같은 코드는 하드웨어에 직접 접근하는 코드이기 때문에
//            //사용 후에는 메모리 정리를 해야 다음 실행에 있어 문제가 발생할 확률이 줄어든다.
//            try {
//                if(fos != null)fos.close(); //필수로 넣어줘야 함⭐⭐
//            } catch (IOException e) {
//               e.printStackTrace();
//            }
//        }
    }


}
