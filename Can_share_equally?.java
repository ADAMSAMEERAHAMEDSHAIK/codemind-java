import java.util.Scanner;

public class CodeMind{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = (x + (y*2));
        if(x == 0 && y%2==0){
            System.out.println("YES");
        }
        else if(x == 0 && y%2!=0){
            System.out.println("NO");
        }
        else if(z%2==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}