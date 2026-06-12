
import java.util.Scanner;
import java.util.HashMap;

public class SameDifference {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            
            long count = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i=0; i<n; i++){
                int key = a[i] - i;
                if(map.containsKey(key)){
                    count += map.get(key);
                    map.put(key, map.get(key) + 1);
                } else {
                    map.put(key, 1);
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
