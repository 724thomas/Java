package src.java.ch20;

public class ArrayTest {
    public static void main(String[] args) {

        int arr[] = new int[10];
        //int arr[] = new int[] {1,2,3,4,5,6,7,8,9,10};
        int total = 0;

        for (int i=0, num=1; i<arr.length; i++){
            arr[i]=num++;
        }

        for ( int num : arr) { //0부터 n-1번까지 쭉 순회할때 사용
            total += num;
        }

        System.out.println(total);
    }
}
