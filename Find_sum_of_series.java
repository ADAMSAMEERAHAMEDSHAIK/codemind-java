import java.util.*;

public class CodeMind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float c = 0 ;
        for(int i=1;i<=n;i++){
            c+=(1.0/i);
        }
        System.out.printf("%.2f",c);
    }
}
