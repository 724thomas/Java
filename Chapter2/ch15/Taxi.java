package Chapter2.ch15;

public class Taxi {

    String companyName;
    int money;
    int traveledDistance;
    int possibleDistance;

    public Taxi (String companyName, int money, int possibleDistance){
        this.companyName=companyName;
        this.money=money;
        this.possibleDistance=possibleDistance;
    }
    public void GiveRide(int money, int traveledDistance){
        this.money+=money;
        this.possibleDistance-=traveledDistance;
        this.traveledDistance+=traveledDistance;
    }

    public void showTaxiInfo(){
        System.out.println(companyName + "택시의 수입은 " + money + "입니다.");
        System.out.println(companyName + "택시가 이동한 거리는 " + traveledDistance + "km 입니다");
        System.out.println(companyName + "택시가 이동 가능 거리는 " + possibleDistance + "km 입니다");
    }
}
