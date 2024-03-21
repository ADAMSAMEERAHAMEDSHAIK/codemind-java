import java.util.*;
import java.util.Arrays;

public class CodeMind{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine(); 
        String s2 = sc.nextLine();
        String s3 = s1.concat(s2);
        char[] s4 = s3.toCharArray();
        Arrays.sort(s4);
        String sorted = new String(s4);
        System.out.println(sorted);
    }
}