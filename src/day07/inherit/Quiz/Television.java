package day07.inherit.Quiz;

public class Television extends ElectronicProduct{

    int screenSize;

    public Television(String productName, int price, String manufacturer, int screenSize ) {
        super(productName, price, manufacturer);
        this.screenSize = screenSize;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.printf("Screen Size: "+ screenSize + "inches");
    };


}
