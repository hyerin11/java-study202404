package day07.inherit.Quiz;

public class ElectronicProduct {
    String productName; //제품명
    int price; //가격
    String manufacturer; //문자열

    public ElectronicProduct(String productName, int price, String manufacturer){
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public void displayInfo() {
        System.out.println(productName+", 가격: "+price+"원, 제조사: "+manufacturer);
    }

}


