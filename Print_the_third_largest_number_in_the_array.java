import java.util.*;

public class CodeMind{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n<4 || n>=100){
            System.out.println("It is not possible");
            return;
        }
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = scanner.nextInt();
        }
        int thirdLargest = findThirdLargest(array);
        
        if(thirdLargest != Integer.MIN_VALUE){
            System.out.println(thirdLargest);
        }else{
            System.out.println("It is not possible");
        }
    }
    public static int findThirdLargest(int[] array){
        int first, second, third;
        first = second = third = Integer.MIN_VALUE;
        for(int num : array){
            if (num>first) {
                third = second;
                second = first;
                first = num;
            }else if(num>second && num<first) {
                third = second;
                second = num;
            }else if(num>third && num<second){
                third = num;
            }
        }
        return third;
    }
}
