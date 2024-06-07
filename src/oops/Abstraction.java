package oops;

public class Abstraction {
    public static void main(String[] args) {
        Sony sony = new Sony();
        sony.switchOn();
        sony.switchOff();

        LG lg = new LG();
        lg.switchOn();
        lg.switchOff();
    }
}

// abstract keyword
abstract class TV {
    int price;
    abstract void switchOn();
    abstract void switchOff();
}

class Sony extends TV {
    @Override
    void switchOn() {
        System.out.println("Sony TV is switched on");
    }

    @Override
    void switchOff() {
        System.out.println("Sony TV is switched off");
    }
}

class LG extends TV {
    @Override
    void switchOn() {
        System.out.println("LG TV is switched on");
    }

    @Override
    void switchOff() {
        System.out.println("LG TV is switched off");
    }
}