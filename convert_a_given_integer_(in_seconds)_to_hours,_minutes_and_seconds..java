import java.util.Scanner;
public class CodeMind
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int h = a/3600;
        int r = a%3600;
        int m = r/60;
        int s = r%60;
        System.out.println("H" + ":" + "M" + ":" + "S" + "-" + h + ":" + m + ":" + s);
    }
}