package src.java.ch14;

public class TakeTransTest {
    public static void main(String[] args) {

        Student studentJ = new Student("James",5000);
        Student studentT = new Student("Tomas", 10000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(100);
        Subway greenSubway = new Subway(2);
        Subway yellowSubway = new Subway(3);

        studentJ.takeBus(bus100);

        studentT.takeSubway(greenSubway);

        studentJ.showInfo();
        studentT.showInfo();

        bus100.showBusInfo();
        greenSubway.showSubwayinfo();

    }
}
