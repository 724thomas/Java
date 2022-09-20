package src.java.input;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 입력 메소드
        // 사용자가 콘솔을 통해 입력한 데이터를 저장
        Scanner sc = new Scanner(System.in);
        // 객체 (object): 실제 행동하는 단위

        int num = sc.nextInt();
        System.out.println(num);
        double d = sc.nextDouble();
        System.out.println(d);
    }
}
