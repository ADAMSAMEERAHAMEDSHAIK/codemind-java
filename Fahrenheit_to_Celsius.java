import java.util.*;

public class CodeMind{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        double c = ((double)((f-32)*5)/9);
        System.out.printf("%.2f",c);
    }
}