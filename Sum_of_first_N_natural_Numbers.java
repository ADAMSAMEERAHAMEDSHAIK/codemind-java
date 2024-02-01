import java.util.*;

public class CodeMind
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int c = 0;
        while(i<=n)
        {
            c+=i;
            i++;
        }
        System.out.println(c);
    }
}