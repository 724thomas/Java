public class Test {
    public static void main(String[] args) {

        int ans;
        int i;
        int j;
        /*
        for (i=2;i<10;i++) {
            for (j = 1; j < 10; j++) {
                ans = i * j;
                System.out.println(ans);
            }
        }
        */
        i=2;
        while (i<10){
            j=1;
            while (j<10){
                ans = i * j;
                System.out.println(ans);
                j+=1;
            }
            i+=1;
        }
    }
}
