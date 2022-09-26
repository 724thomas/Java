package src.java.ch15;

public class TakingTaxi {
    public static void main(String[] args) {

        Person person_Edward = new Person("Edward",20000);
        Person person_Thomas = new Person ("Thomas",100000);
        Taxi taxi1 = new Taxi("잘나간다 운수",0,100);
        Taxi taxi2 = new Taxi ("멀리간다 운수",0,200);

        person_Edward.takeTaxi(taxi1,3000,2);
        person_Thomas.takeTaxi(taxi1, 20000,30);
        person_Edward.takeTaxi(taxi2, 5000,3);
        person_Thomas.takeTaxi(taxi2, 50000,50);

        person_Edward.showPersonInfo();
        person_Thomas.showPersonInfo();

        taxi1.showTaxiInfo();
        taxi2.showTaxiInfo();




    }
}
