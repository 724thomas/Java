package Chapter2.ch15;

public class Person {

    String personName;
    int money;
    int travelDistance;
    public Person (String personName, int money){
        this.personName=personName;
        this.money=money;
    }

    public void takeTaxi (Taxi taxi, int money, int travelDistance){
        taxi.GiveRide(money,travelDistance);
        this.money-=money;
        this.travelDistance+=travelDistance;
    }

    public void showPersonInfo(){
        System.out.println(personName + "님의 남은 돈은 " + money + "입니다.");
        System.out.println(personName + "님이 이동하신 거리는 " + travelDistance + "km 입니다");
    }

}
