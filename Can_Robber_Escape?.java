import java.util.*;

public class CodeMind{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int c=0;
        for(int i:a){
            if(i%2!=0){
                c++;
            }
        }
        System.out.println(c<=2?"YES":"NO");
        
    }
}