package day11.api.time;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {

        //자바 8 이전
        Date date = new Date();
        System.out.println("date = " + date.getYear());

        Calendar calendar = Calendar.getInstance();

        //자바 8 이후
        LocalDate nowDate = LocalDate.now();
        System.out.println("nowDate = " + nowDate);

        System.out.println(nowDate.getYear()); //2024
        System.out.println(nowDate.getMonthValue()); //4

        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("nowDateTime = " + nowDateTime);

        //특정 날짜 정보 생성하기
        LocalDate targetDate = LocalDate.of(2022, 4, 15);
        System.out.println("targetDate = " + targetDate);


        //날짜 연산
        //도서 대여 시스템에서 빌린 날짜로부터 3일 뒤가 반납일
        LocalDate rentalDate = LocalDate.now();
        LocalDate returnDate = rentalDate.plusDays(3);
        System.out.println("returnDate = " + returnDate);

        returnDate
                .plusYears(2)
                .plusMonths(3)
                .plusDays(5);

        System.out.println("targetDate = " + targetDate);
        
        //사이 날짜 구하기
        LocalDate hireDate = LocalDate.of(2018, 3, 6);
        LocalDate retireDate = LocalDate.of(2022, 12, 27);

        long between = ChronoUnit.DAYS.between(hireDate, retireDate);
        System.out.println("between = " + between);
        
        //날짜 포맷 바꾸기
        System.out.println("nowDateTime = " + nowDateTime);
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yy년 MM월 DD일 a hh시 mm분 ss초");
        
        
        String dateString = nowDate.format(pattern);
        System.out.println("dateString = " + dateString);
        
    }
}
