import java.util.Scanner;
public class CodeMind
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int s = sc.nextInt();
        int b = sc.nextInt();
        int c = t*s*b*2*512;
        System.out.println(c);
    }
}