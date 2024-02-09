import java.util.*;

public class CodeMind{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = isPalindrome(n);
        if (result == 2) {
            System.out.println("2");
        } else {
            System.out.println("1");
        }
    }
    public static int isPalindrome(int num) {
        int on = num;
        int rn = 0;
        while(num!=0){
            int d=num%10;
            rn = rn*10+d;
            num/=10;
        }
        if (on == rn) {
            return 2;
        } else {
            return 1;
        }
    }
}
