import java.util.Scanner;
public class CodeMind
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String b=s.substring(2);
        int c=Integer.parseInt(b);
        if(c<10){
            System.out.println(0+""+c);
        }
        else{
        System.out.println(c);
        }
    }
}