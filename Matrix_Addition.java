import java.util.*;

public class CodeMind{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
    
        int[][] m1 = new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                m1[i][j]=sc.nextInt();
            }
        }
        int o = sc.nextInt();
        int p = sc.nextInt();
        
        int[][] m2 = new int[o][p];
        for(int i=0;i<p;i++){
            for(int j=0;j<o;j++){
                m2[i][j] = sc.nextInt();
            }
        }
        int[][] m3 = new int[n][m];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    m3[i][j] = m1[i][j] + m2[i][j];
                }
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(m3[i][j] + " ");
                }
                System.out.println();
            }
    }
}