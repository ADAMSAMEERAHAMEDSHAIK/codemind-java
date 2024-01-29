import java.util.Scanner;
public class CodeMind
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int yrs = days/365;
        int rdays = days%365;
        int weeks = rdays/7;
        System.out.println(yrs);
        System.out.println(weeks);
    }
}