
import java.util.Scanner;

public class sublimeSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int x = sc.nextInt();
            int n = sc.nextInt();
            sc.close();
            int sum = 0;
            while(n-- > 0){
                sum += x;
                x=-x;
            }
            System.out.println(sum);
        }
    }
}
