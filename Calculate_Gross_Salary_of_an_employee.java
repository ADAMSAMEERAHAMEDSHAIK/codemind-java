import java.util.Scanner;

public class CodeMind 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float bs = sc.nextFloat();
        float hra = sc.nextFloat();
        float da = sc.nextFloat();
        float pf = 0.12f * bs;
        float gs = bs + hra + da + pf;
        System.out.printf("%.2f
%.2f
", pf, gs);
    }
}
