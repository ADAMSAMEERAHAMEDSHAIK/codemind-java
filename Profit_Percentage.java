import java.util.Scanner;
public class CodeMind
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float cp = sc.nextFloat();
        float sp = sc.nextFloat();
        float c = ((sp - cp)/cp)*100;
        System.out.printf("%.2f",c);
    }
}