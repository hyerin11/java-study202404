package day07.inherit.Quiz;

public class Smartphone extends ElectronicProduct {
    int storageCapacity;

    public Smartphone(String productName, int price, String manufacturer, int storageCapacity) {
        super(productName, price, manufacturer);
        this.storageCapacity = storageCapacity;

    }

    public void displayInfo(){
        super.displayInfo();
        System.out.printf("저장 용량: "+ storageCapacity + "GB");
    };
    
}
