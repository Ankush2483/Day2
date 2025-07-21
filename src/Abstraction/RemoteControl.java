package Abstraction;
//Create a RemoteControl interface with methods turnOn() and turnOff().
// Implement it in classes like TV and AirConditioner.
interface RemoteControl {
    void trunOn();
    void trunOff();
}
class AC implements RemoteControl {
    @Override
    public void trunOn() {
        System.out.println("AC TRUN ON");
    }

    @Override
    public void trunOff() {
        System.out.println("AC TRUN OFF");

    }
}
class Tv implements RemoteControl {
    @Override
    public void trunOn() {
        System.out.println("Tv TRUN ON");
    }
    @Override
    public void trunOff() {
        System.out.println("Tv TRUN OFF");
    }
}

class Test {
    public static void main(String[] args) {
        RemoteControl tv = new Tv();
        RemoteControl ac = new AC();
        ac.trunOn();
        ac.trunOff();
        tv.trunOn();
        tv.trunOff();


    }
}
