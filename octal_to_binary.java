import java.util.*;

public class CodeMind{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int d=Integer.parseInt(n,8);
        String c = Integer.toBinaryString(d);
        System.out.println(c);
    }
}