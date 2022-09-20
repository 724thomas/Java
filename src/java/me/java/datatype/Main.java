package src.java.me.java.datatype;

public class Main {
    public static void main(String[] args) {
        // 자료형 (datatype)
        // 원시 자료형 (primitive type) : 스택(stack) 공간 저장
        // int (4byte == 32bit) : -2^31 ~ 2^31-1
        // long (8byte == 64bit) : -2^63 ~ 2^63-1
        // float (4byte)
        // double (8byte)
        // char (2byte)
        // 1byte = 8bit
        //---------------
        // 참조형 (Reference type) : 힙(heep) 공간 저장
        // String (클래스)

        // 작은 발은 큰 신발에 들어갈 수 있다.
        // 작은 리터럴은 큰 변수공간에는 들어갈 수 있다.
        // 큰 리터럴이 작은 변수공간에 들어갈 자리가 있으면 auto-casting이 된다.
        byte b =10;        // Auto-casting (명시적 형변환)
        short s =10;       // Auto-casting (명시적 형변환)
        int i=10;          // 정수의 기본단위
        long l =10;        // promotion (자동 형변환)
        float f = 3.14f;
        double d =3.14f;    // 실수의 기본 단위

        byte bb = (byte)10000;     // Type casting -> 데이터 손실
        short ss = (short)10000;   // Type casting -> 데이터 손실

    }
}
