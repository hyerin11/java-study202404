package day10.exception;

public class Main {
    public static void main(String[] args) {
        ThrowsExample te = new ThrowsExample();

//        int n = te.inputNumber();
//        System.out.println("n = " + n);


//        try {
//            int n = te.convert("10?0");
//            System.out.println("n = " + n*20);
//        } catch (NumberFormatException e) {
//            System.out.println("dkadkl");
//        }

        try{
            user.loginValidate LoginUser("abc123", "123");

        }catch(Exception e){
            System.out.println();
        }
        new LoginUser("abc1234", "1234");

    }
}
