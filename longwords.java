
import java.util.Scanner;
public class longwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String word[] = new String[n];
        for(int i = 0; i < n; i++) {
            word[i] = sc.next();
        }
        sc.close();
        for(int i=0; i < n; i++) {
            if(word[i].length() > 10) {
                System.out.println(word[i].charAt(0) + Integer.toString(word[i].length() - 2) + word[i].charAt(word[i].length() - 1));
            } else {
                System.out.println(word[i]);
            }
        }
    }
}
