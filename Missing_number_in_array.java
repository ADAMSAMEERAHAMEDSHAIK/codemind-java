import java.util.*;

public class CodeMind{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int s=0;
            for(int j=0;j<n-1;j++){
                int a = sc.nextInt();
                s+=a;
            }
            int es = (n*(n+1))/2;
            int missingNumber = es-s;
            System.out.println(missingNumber);
        }
    }
}