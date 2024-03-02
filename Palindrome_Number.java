import java.util.*;

public class CodeMind{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int r,d=0;
            int c=n;
            while(n!=0){
                r = n%10;
                d = (d*10) + r;
                n/=10;
            }
            if(d==c){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
    }
}
