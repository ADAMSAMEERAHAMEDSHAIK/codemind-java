import java.util.Scanner;
public class CodeMind
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = (n*(n-1))/2;
		System.out.println(x);
	}
}