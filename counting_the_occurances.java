import java.util.*;

public class CodeMind{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char s1 = sc.next().charAt(0);
        int c = countCharacter(s, s1);
        System.out.println(c);
    }
    private static int countCharacter(String s, char d) {
        int c = 0;
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)==d) {
                c++;
            }
        }
        if(c==0) {
            return -1;
        }
        return c;
    }
}
