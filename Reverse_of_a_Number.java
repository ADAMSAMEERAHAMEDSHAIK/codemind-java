import java.util.*;

public class CodeMind{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=n;
        int r,d=0;
        while(n>0){
            r=n%10;
            d=d*10+r;
            n/=10;
        }
        System.out.println(d);
    }
}