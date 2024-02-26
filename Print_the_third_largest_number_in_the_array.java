import java.util.*;

public class CodeMind{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=4 && n<100){
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            Set<Integer> F = new HashSet<>();
            for(int num : a){
                F.add(num);
            }
            int[] b = new int[F.size()];
            int i=0; 
            for(int num : F){
                b[i++] = num; 
            }
            Arrays.sort(b); 
            if(b.length>=3){
                System.out.print(b[b.length - 3]); 
            }else{
                System.out.print("It is not possible");
            }
        }else{
            System.out.print("It is not possible");
        }
    }
}