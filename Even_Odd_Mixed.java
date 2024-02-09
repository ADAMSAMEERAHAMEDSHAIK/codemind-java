import java.util.*;

public class CodeMind{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = 0;
        int o = 0;
        while(n>0){
            int r = n%10;
            if(r%2==0){
                e++;
            }else{
                o++;
            }
            n/=10;
        }
        if(e>0 && o>0){
            System.out.println("Mixed");
        }else if(e==0){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
}