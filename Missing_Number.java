import java.util.*;

public class CodeMind{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=0;
        for(int i=0;i<n-1;i++){
            int a = sc.nextInt();
            s+=a;
        }
        int es = (n*(n+1))/2;
        int missingNumber = es-s;
        System.out.println(missingNumber);
    }
}
