
import java.util.Scanner;
public class bitwiseBalancing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d= sc.nextLong();
            long ans = -1;
            
            long left = 0, right = 2L * (b + c + d + 1);
            
            while(left <= right){
                long mid = left + (right - left) / 2;
                long val = (mid|b) - (mid&c);
                
                if(val == d){
                    ans = mid;
                    break;
                }
                else if(val < d){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}