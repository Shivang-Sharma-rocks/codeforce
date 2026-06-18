import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int h=sc.nextInt();
    int w=0;
    int a[]= new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
        if(a[i]>h){
            w+=2;
        }else{
            w++;
        }
    }
    sc.close();
    System.out.println(w);
    }
}
