package day08.static_;

public class Calculator {

    String color; //계산기 색상(색상은 다 다르니까 static 붙이면 안됨)
    static double pi; //계산기 안에 저장된 원주율

    //원의 넓이를 구하는 메서드
    double calcArea(int r){
        return pi * r * r;
    }
    //계산기에 색칠하는 메서드
    void paint(String color){
        this.color = color;
    }

}
