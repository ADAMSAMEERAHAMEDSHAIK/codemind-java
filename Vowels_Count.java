import java.util.*;


public class CodeMind{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int vowelCount = countVowels(s);
        System.out.println(vowelCount);
    }
    private static int countVowels(String str){
        int c = 0;
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                c++;
            }
        }
        return c;
    }
}