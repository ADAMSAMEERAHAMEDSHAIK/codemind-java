import java.util.*;

public class CodeMind{
    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++) {
            if(a[i]>=k && isPrime(a[i])){
                c++;
            }
        }
        System.out.println(c);
    }
}
