package codeforce;

import java.util.*;
public class Quality_Quantity{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n= sc.nextInt();
            long a[] = new long[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            long max = a[n-1];
            long s2 = a[0] + a[1];

            if(max > s2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}