import java.util.Scanner;

public class CodeMind{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int c=0;
        while(c!=t){
            String str = sc.next();
            int b1 = Integer.parseInt(str,8);
            String b2 = Integer.toString(b1,2);
            System.out.println(b2);
            t--;
        }
    }
}