import java.util.*;

public class CodeMind{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for(int i=0;i<n;i++){
            int s = a[i]*a[i];
            b[i]=s;
            
        }
        Arrays.sort(b);
        for(int i=0;i<n;i++){
             System.out.print(b[i]+" ");
        }
       
    }
}