package Chapter2.ch08;

public class Customer {

    int height;
    int weight;
    int age;
    String name;
    public Customer(int height, int weight, int age, String name) {
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.name = name;
    }
    public String showCustomerInfo() {
        return "키가 " + height
                + " 이고 몸무게가 " + weight
                + " 킬로인 남성이 있습니다. 이름은 "
                + name + " 이고 나이는 "
                + age + " 세 입니다.";
    }
}
