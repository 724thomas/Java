package src.java.choieunbin;

import java.util.Scanner;

public class excercise0920 {
    public static void main(String[] args) {

        //실습 1

        Scanner sc = new Scanner(System.in);
        double payment;
        double product_price;
        double product_VAT;
        System.out.print("노트북 금액을 입력하세요: ");
        product_price=sc.nextDouble();
        product_VAT=product_price*0.1;
        System.out.println("총 금액은 " + (product_price+product_VAT) + "입니다.");
        System.out.print("지불 금액을 입력하세요: ");
        payment = sc.nextDouble();

        while (payment < (product_price+product_VAT) ){
            System.out.println("");
            System.out.println("지불 금액이 " + -(payment-product_price-product_VAT) +"원 부족합니다.");
            System.out.println("총 지불해야할 금액은 " + (product_price+product_VAT) + "원 입니다.");
            System.out.println("");
            System.out.print("지불 금액을 다시 입력하세요: ");
            payment=sc.nextDouble();
        }
        System.out.println("잔돈은 " + (payment - product_price -  product_VAT) + "입니다.");


        //실습2

        double num1;
        double num2;
        System.out.print("첫번째 수를 입력해주세요: ");
        num1=sc.nextDouble();
        System.out.print("두번째 수를 입력해주세요: ");
        num2=sc.nextDouble();
        if (num1>num2){
            System.out.println("최솟값: " + num2 + " 최댓값: " + num1);
        } else if (num1<num2) {
            System.out.println("최솟값: " + num2 + " 최댓값: " + num1);
        } else{
            System.out.println("두 수가 같습니다.");
        }


        //실습3

        int year;
        boolean ans;
        System.out.print("연도를 입력하세요 :");
        year=sc.nextInt();
        ans= ((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0;
        System.out.println( "해당 " + year + "연도는 : " + (ans ? "'윤년'" : "평년") + "입니다." );


        //실습4

        int num=sc.nextInt();
        int switchnum = 1 + ( num >> 31 ) - ( -num >> 31 );
        switch(switchnum){
            case 0:
                System.out.println("음수");
                break;
            case 1:
                System.out.println("0");
                break;
            case 2:
                System.out.println("양수");
                break;
            }


        //실습5
        /*
        Scanner sc = new Scanner(System.in);
        int num1 = 123456780;
        int num2 = 123456780;

        float num3 = num2; //float로 변환하면서 저장할 수 있는 공간을 초과.
        num2 = (int) num3;
        System.out.println(num3);
        System.out.println(num2);

        int result = num1 - num2;
        System.out.println(result);
        */

        //실습6
        /*
        byte byte1 = 1;
        byte byte2 = 1;
        byte byte3 = byte1 + byte2; // 저장 공간 초과.
        byte byteValue = 65;
        char charValue = byteValue; //캐스팅 필요
        */

        //실습7
        /*
        int i = 1;
        int j = 2;
        boolean isGood = ((i < j) || (i == 3)) ? true : false;
        */

        //실습4 Continue
        /*
        int a=0;
        int b=34;
        int c=-45;

        System.out.println( (a >> 31) - (-a >> 31) );
        System.out.println( (b >> 31) - (-b >> 31) );
        System.out.println( (c >> 31) - (-c >> 31) );
        */
    }
}
