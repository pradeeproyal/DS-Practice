package app;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(final String[] args) throws Exception {
        /*
        int T = 0;

        final Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        for (final int i = 0; i < T; i++) {
            final int N = sc.nextInt();
            final int S = sc.nextInt();
            final int[] values = new int[N];
            for (int j = 0; j < N; j++) {
                values[j] = sc.nextInt();
            }

            System.out.println("index::" + i);
        }

        sc.close();
        */
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String s = getIndex(values, 10,15);
        System.out.println(s);
    }
    public static String getIndex(int[] values, int n, int sum){
        int startposition=0;
       
        for(int k=0;k<n-1;k++){
            int temp=values[k];
            startposition=k;
            if(temp==sum)
            {
                return String.format("%d  %d", startposition+1,k+1);
            }
            for(int j=k+1;j<n&& temp<sum;j++){
                temp+=values[j];
                if(temp==sum){
                    return String.format("%d  %d", startposition+1,j+1);
                }
            }
        }
        return "-1";
    }
}