import java.util.*;

public class CodeMind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int a,b;
            a = sc.nextInt();
            b = sc.nextInt();
            int c =0;
            for(int i = a;i<=b;i++){
                if(i%10==2 || i%10==3 || i%10==9){
                    c+=1;
                }
            }
            System.out.println(c);
        }
    }
}
