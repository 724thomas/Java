package Chapter2.ch19;

public class Car {
    public static int serialNum=10000;

    private int carNum;
    public Car(){
        serialNum++;
        carNum=serialNum;
    }

    public int getCarNum(){
        return carNum;
    }
}
