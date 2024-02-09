import java.util.*;

public class CodeMind{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c=s.length();
        if(c==10){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}