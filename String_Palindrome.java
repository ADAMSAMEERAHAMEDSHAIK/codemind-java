import java.util.*;

public class CodeMind{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(isPalindrome(s)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    private static boolean isPalindrome(String str){
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}