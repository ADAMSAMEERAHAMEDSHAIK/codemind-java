import java.util.*;

public class CodeMind {
    private static boolean isPrime(int n) {
        if (n<=1) {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        for(int i=a;i<=b;i++) {
            if(isPrime(i)){
                c++;
            }
        }
        System.out.println(c);
    }
}
