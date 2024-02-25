import java.util.*;

public class CodeMind{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            String result = canBeFactor(a,b);
            System.out.println(result);
        }
    }
    public static String canBeFactor(int a,int b){
        if(b%a==0){
            return "YES";
        }
        int diff = b-a;
        return (diff>=a)?"YES":"NO";
    }
}