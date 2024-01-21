import java.util.Scanner;
public class CodeMind
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = 3 * a - b - c;
        System.out.println(avg);
    }
}