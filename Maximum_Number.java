import java.util.*;

public class CodeMind{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        char[] d = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(d[i]!='9'){
                d[i]='9';
                break;
            }
        }
        System.out.println(d);
    }
}