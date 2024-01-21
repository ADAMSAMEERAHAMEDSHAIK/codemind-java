import java.util.Scanner;
public class CodeMind
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int a,b,z;
            a = sc.nextInt();
            b = sc.nextInt();
            z = Math.abs(a-b);
            if(z>=a || a==b)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}