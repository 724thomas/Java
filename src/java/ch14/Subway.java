package src.java.ch14;

public class Subway {

    int subwayNumber;
    int passengerCount;
    int money;

    public Subway(int subwayNumber){
        this.subwayNumber=subwayNumber;
    }

    public void take(int money){
        this.money+=1200;
        passengerCount++;
    }

    public void showSubwayinfo(){
        System.out.println(subwayNumber+"번의 승객 수는 " +passengerCount + "명이고 , 수입은 " + money + "원 입니다.");
    }
}
