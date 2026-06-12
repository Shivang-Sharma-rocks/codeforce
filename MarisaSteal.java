

import java.util.Scanner;

public class MarisaSteal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] m = new int[3];
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                m[val]++;
            }

            int operations = m[0];
            
            int pairs = Math.min(m[1], m[2]);
            operations += pairs;

            int leftoverOnes = m[1] - pairs;
            int leftoverTwos = m[2] - pairs;

            operations += leftoverOnes / 3;
            operations += leftoverTwos / 3;
            
            System.out.println(operations);
        }
        
        sc.close();
    }
}
