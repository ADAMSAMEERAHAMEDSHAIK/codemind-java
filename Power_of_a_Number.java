import java.util.*;

public class CodeMind{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int m = sc.nextInt();
        int p = (int) Math.pow(x,y);
        int s = p%m;
        System.out.println(s);
    }
}
