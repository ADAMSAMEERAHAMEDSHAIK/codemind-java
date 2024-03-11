import java.util.*;

public class CodeMind{
    public static String reverseWords(String s){
        String[] words = s.trim().split("\s+");
        int start=0,end=words.length-1;
        while(start<end){
            String temp = words[start];
            words[start]=words[end];
            words[end]=temp;
            start++;
            end--;
        }
        return String.join(" ", words);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String c = reverseWords(s1);
        System.out.println(c);
    }
}