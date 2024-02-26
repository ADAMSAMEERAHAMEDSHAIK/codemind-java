import java.util.*;

public class CodeMind{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                c++;
            }
        }
        for(int j=0;j<c;j++){
            a[j]=0;
        }
        for(int k=c;k<n;k++){
            a[k]=1;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}