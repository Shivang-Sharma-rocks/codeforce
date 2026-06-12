import java.util.*;
public class Next_Round{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int num = 0;
        int ki=0;
        for(int i=0 ;i<n;i++){
            int score = sc.nextInt();
            if(i==k){
                ki = score;
            }

            if(score >= ki && score>0){
                num++;
            }
            else if(score <ki || score ==0){
                break;
            }
        }
        sc.close();
        System.out.println(num);
    }
}