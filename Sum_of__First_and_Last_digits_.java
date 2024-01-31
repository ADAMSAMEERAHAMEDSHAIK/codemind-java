import java.util.Scanner;

public class CodeMind
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b=n;
        int f=0;
        while(b!=0)
        {
            f = b;
            b = b/10;
        }
        int l = n%10;
        int s = f + l;
        System.out.println(s);
    }
}