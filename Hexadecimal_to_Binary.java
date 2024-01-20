import java.util.Scanner;
public class CodeMind
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s = sc.nextLine();
            int temp = Integer.parseInt(s,16);
            String binary = Integer.toBinaryString(temp);
            if(binary.length()%4==0)
            {
                System.out.println(binary);
            }
            else
            {
                int k = binary.length()%4;
                for(int i=0;i<4-k;i++)
                {
                    System.out.print("0");
                }
                System.out.println(binary);
            }
        }
    }
}