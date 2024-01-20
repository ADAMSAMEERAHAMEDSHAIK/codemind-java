import java.util.Scanner;
public class CodeMind 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        for(int i = A; i <= B; i++) 
        {
            System.out.print(i + " ");
        }
        sc.close();
    }
}