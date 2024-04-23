package day11.api.lang;

import java.util.Objects;

class Pen {

    /*
         const redPen = {
            serial: 100,
            color: 'red',
            price: 500,
            company: {
                companyName: 'monami',
                address: 'seoul'
            }
         }
     */

    long serial; // 일련번호
    String color; // 색상
    int price; // 가격
    Company company; // 펜 제조사정보

    public Pen(long serial, String color, int price, Company company) {
        this.serial = serial;
        this.color = color;
        this.price = price;
        this.company = company;
    }

//    //펜의 시리얼 번호가 같으면 같은 펜으로 취급하게 한다.
//    public boolean equals(Object o){
//        if(o instanceof Pen){
//            Pen target = (Pen) o;
//            return this.serial == target.serial;
//        }
//        return false;
//    }

    //equals를 오버라이딩할 떄 반드시 hashCode도 같이 오버라이딩하여 두 객체가 같은 경우 주소값도 같게 만든다.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return serial == pen.serial && price == pen.price && Objects.equals(color, pen.color) && Objects.equals(company, pen.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serial, color, price, company);
    }

    @Override
    public String toString() {
        return "Pen{" +
                "serial=" + serial +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", company=" + company +
                '}';
    }
}

class Company extends Object {

    String companyName; // 회사명
    String address; // 회사 주소

    public Company(String companyName, String address) {
        this.companyName = companyName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

public class ObjectSample extends Object {

    public static void main(String[] args) {

        Company company = new Company("모나미", "서울");
        System.out.println("company = " + company);

        Pen yellowPen = new Pen(100L, "노랑", 1000, company);


        System.out.println("company = " + yellowPen.company);

        String cName = yellowPen.company.companyName;
        System.out.println("cName = " + cName);
        System.out.println("yellowPen = " + yellowPen);

        Pen bluePen
                = new Pen(200L,
                "파랑", 1200,
                new Company("제트스트림", "도쿄"));

        System.out.println("========================");

        System.out.println(yellowPen == bluePen);
        System.out.println(Integer.toHexString(bluePen.hashCode()));
        System.out.println(Integer.toHexString(yellowPen.hashCode()));


        System.out.println("========================");

        //만약에 펜의 시리얼 넘버가 같다면 같은 펜으로 취급하겠다.
        Pen redPen1 = new Pen(150L, "빨강", 1000, company);
        Pen redPen2 = new Pen(150L, "빨강", 1500, company);

        //레드1이랑 레드2랑 같아?
        System.out.println(redPen1==redPen2); //false
        System.out.println(redPen1.equals(redPen2)); //true(시리얼 넘버가 같기 때문에 트루라고 판정하라고 만듦)

        System.out.println("redPen1 = " + redPen1.hashCode());
        System.out.println("redPen2 = " + redPen2.hashCode());
    }
}
