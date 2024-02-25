import java.util.*;

public class CodeMind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c=0;
        int d=0;
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                c++;
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]%2!=0){
                d++;
            }
        }
        System.out.println(c + " " + d);
    }
}
