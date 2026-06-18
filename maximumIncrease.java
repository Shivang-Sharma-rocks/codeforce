import java.util.Scanner;

public class maximumIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]= new int[n];
        int last=0;
        int curr=1;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(i>0 &&a[i-1]<a[i]){
                curr++;
            }else {
                if(curr>last){
                last=curr;
            }
            curr=1;
        }

        }
        int m=Math.max(last,curr);
        sc.close();
        System.out.println(m);
    }    
}
