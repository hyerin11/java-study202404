package day09.poly.computer;

import java.security.interfaces.DSAKey;

public class Main {
    public static void main(String[] args) {
        Desktop myCom = new Desktop(new LgMonitor());
        Desktop friendCom = new Desktop(new Monitor());

        myCom.changeMonitor(new HpMonitor());
        myCom.changeMonitor(new LgMonitor());
    }
}
