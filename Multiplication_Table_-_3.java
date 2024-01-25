import java.util.Scanner;
public class CodeMind
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        for(int i=b;i<=c;i++)
        {
            System.out.println(a + " x " + i + " = " + a*i);
        }
    }
}