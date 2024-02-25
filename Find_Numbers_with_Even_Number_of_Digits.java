import java.util.*;

public class CodeMind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int n = sc.nextInt();
        String[] a = new String[n];

        for (int i = 0; i < n; i++) {
            a[i] = String.valueOf(sc.nextInt()); // Convert integer to string
        }

        for (int i = 0; i < n; i++) {
            if (a[i].length() % 2 == 0) {
                c += 1;
            }
        }

        System.out.println(c);
    }
}
