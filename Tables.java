import java.util.*;

public class CodeMind{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c=0;
        for(int i=1;i<=b;i++){
            if(i%2!=0){
                c=i;
                System.out.println(a + " x " + i + " = " + a*c);
            }
        }
    }
}
