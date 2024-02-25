import java.util.*;

public class CodeMind{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int[] result = countNumbers(a);
        for(int i=0;i<n;i++){
            System.out.print(result[i] + " ");
        }
    }
    public static int[] countNumbers(int[] a){
        int N = a.length;
        int[] result = new int[N];
        for(int i=0;i<N;i++){
            int c=0;
            for(int j=0;j<N;j++){
                if(a[j]<a[i] && j!=i){
                    c++;
                }
            }
            result[i] = c;
        }
        return result;
    }
}