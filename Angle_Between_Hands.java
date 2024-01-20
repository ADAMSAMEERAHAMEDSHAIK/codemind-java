import java.util.Scanner;
public class CodeMind 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        int h = Integer.parseInt(time.substring(0, 2));
        int m = Integer.parseInt(time.substring(3));
        double a = (30 * h) - (5.5 * m);
        a=Math.abs(a);
        double b = 360 - a;
        double minAngle = a < b ? a : b;
        System.out.println(minAngle);
    }
}
