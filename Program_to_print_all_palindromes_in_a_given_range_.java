import java.util.*;

public class CodeMind{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a;i<=b;i++){
            int f=i;
            int r,d=0;
            while(f>0){
                r=f%10;
                d=d*10+r;
                f/=10;
            }
            if(d==i){
                System.out.print(d +" ");
            }
        }
    }
}