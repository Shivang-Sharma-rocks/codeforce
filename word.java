
import java.util.Scanner;

public class word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int uppercount = 0;
        int lowerCount = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                uppercount++;
            } else {
                lowerCount++;
            }
        }
        if(uppercount > lowerCount) {
            System.out.print(s.toUpperCase());
        } else {
            System.out.print(s.toLowerCase());
        }
        sc.close();
    }
}
