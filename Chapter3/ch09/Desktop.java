package Chapter3.ch09;

public class Desktop extends Computer{

    @Override
    public void display() {
        System.out.println("Desktop dispaly");
    }

    @Override
    public void typing() {
        System.out.println("Desktop typing");
    }

    @Override
    public void turnOff(){
        System.out.printf("Desktop TurnOff");
    }
}
