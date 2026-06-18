import java.util.Scanner;

public class burningMidnightOil_fixed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        sc.close();

        long l = 1;
        long r = n;
        long ans = 1;

        while (l <= r) {
            long mid = l + (r - l) / 2;
            long total = 0;
            long x = mid;

            while (x > 0) {
                total += x;
                x /= k;
            }

            if (total >= n) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        System.out.println(ans);
    }
}
