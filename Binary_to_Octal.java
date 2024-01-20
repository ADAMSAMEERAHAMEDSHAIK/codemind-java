import java.util.Scanner;
public class CodeMind 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<Q;i++) {
            String b = sc.nextLine();
            int d = Integer.parseInt(b, 2);
            System.out.println(Integer.toOctalString(d));
        }
    }
}