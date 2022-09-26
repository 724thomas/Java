package src.java.ch08;

public class Delivery {

    String orderNum;
    String price;
    String orderDate;
    String phoneNum;
    String address;
    String orderTime;
    String menuNum;
    public Delivery(String orderDate, String price, String phoneNum, String address, String orderTime, String menuNum) {
        this.orderNum = orderDate + menuNum;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.price = price;
        this.phoneNum = phoneNum;
        this.address = address;
        this.menuNum = menuNum;
    }

    public String showDeliveryInfo() {
        return "주문 접수 번호 : " + orderDate + menuNum
                + "\n 주문 핸드폰 번호 : " + phoneNum
                + "\n 주문 집 주소 : " + address
                + "\n 주문 날짜 : " + orderDate
                + "\n 주문 시간 : " + orderTime
                + "\n 주문 가격 : " + price
                + "\n 메뉴 번호 : " + menuNum;
    }
}
