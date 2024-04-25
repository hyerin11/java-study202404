package day12.stream.quiz1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {

    private static Arrays year;

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        // List<Transaction>

        List<Transaction> allTransaction = transactions.stream()
                .filter(d -> d.getYear() == 2021)
                .sorted(Comparator.comparing(d -> d.getValue()))
                .collect(toList());
        System.out.println("1. allTransaction = " + allTransaction);


        // 연습 2: 거래자가 근무하는 모든 도시이름을 중복 없이 나열하시오.
        // List<String>
        List<String> AllCities = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct() //중복없이
                .collect(toList());
        System.out.println("2. AllCities = " + AllCities);

        // 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 거래자리스트로 이름순으로 오름차정렬.
        // List<Trader>
        List<Trader> allTraderCambridge = transactions.stream()
                .filter(d -> d.getTrader().getCity().equals("Cambridge"))
                .map(trader -> trader.getTrader())
                .sorted(Comparator.comparing(Trader::getName))
                .collect(toList());
        System.out.println("3. allTraderCambraidge = " + allTraderCambridge);


        // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로 오름차정렬하여 반환
        // List<String>
        List<String> allTraderNameList = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                //.sorted(Comparator.comparing(Trader::getName))
                .collect(toList());
        System.out.println("4. allTraderNameList = " + allTraderNameList);



        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        boolean flag1 = transactions.stream()
                .anyMatch(d -> d.getTrader().getCity().equals("Milan"));
        System.out.println("5. flag1 = " + flag1);


        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.
        int allCambridgeValueSum = transactions.stream()
                .filter(d -> d.getTrader().getCity().equals("Cambridge"))
                .mapToInt(transaction -> transaction.getValue())
                .sum();
        System.out.println("6. allCambridgeValueSum = " + allCambridgeValueSum);


        // 연습 7: 모든 거래에서 최고거래액은 얼마인가?
        int maxTransactionValue = transactions.stream()
                .map(transaction -> transaction.getValue())
                .reduce(Integer::max)
                .get();
        System.out.println("7. maxTransactionValue = " + maxTransactionValue);



        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색
        int minTransactionValue = transactions.stream()
                .map(transaction -> transaction.getValue())
                .reduce(Integer::min)
                .orElse(null); //null일 경우 null 내보내겠다.
//                .get();
        System.out.println("8. minTransactionValue = " + minTransactionValue);


        /*
        👾📢자바의 단점 : 널 체크 문법이 없다
         */


        // 연습 9. 거래액이 500 이상인 거래들만 필터링하고, 해당 거래의 정보를 출력하시오.
        List<Transaction> highValue = transactions.stream()
                .filter(d-> d.getValue() > 500)
                .collect(toList());
        System.out.println("9. highValue = " + highValue);


        // 연습 10. 모든 거래에서 가장 작은 거래액보다 큰 거래액을 가진 거래의 평균을 계산하시오.
        // 출력값: 752.0

        //최소 거래액 찾기
//
//        int minTrader = transactions.stream()
//                .map(transaction -> transaction.getValue())
//                .reduce(Integer::min)
//                .get();
//        int bigAverage = transactions.stream()
//                .map(transaction -> transaction.getValue())
//                .reduce(Integer::max)
//                .get();
//        System.out.println("10. average : " + bigAverage);




        // 연습 11. "Cambridge"에서 거래하는 모든 거래자의 거래액을 연도별로 그룹화하여 출력하시오.
        /*
               출력예시

                Year: 2021
                {Trader: Brian in Cambridge, year: 2021, value: 300}
                {Trader: Raoul in Cambridge, year: 2021, value: 400}

                Year: 2022
                {Trader: Raoul in Cambridge, year: 2022, value: 1000}
                {Trader: Alan in Cambridge, year: 2022, value: 950}
         */


        transactions.stream()
                .filter(d -> d.getTrader().getCity().equals("Cambridge"))
                .collect(Collectors.groupingBy(d->d.getYear()))
                .forEach((year, groupedTransactions) -> {
                    System.out.println("\nYear: " + year);
                    groupedTransactions.forEach(System.out::println);
                });





        // 연습 12. 모든 거래 중 가장 큰 거래액과 가장 작은 거래액의 차이를 계산하시오.
        // 출력 값 : 700
        int min = transactions.stream()
                .map(transaction -> transaction.getValue())
                .reduce(Integer::min)
                .get();
        int max = transactions.stream()
                .map(transaction -> transaction.getValue())
                .reduce(Integer::max)
                .get();
        int minus = max-min;
        System.out.println("12. minus : " + minus);



    }


}
