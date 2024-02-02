import java.util.*;

public class PracticeSquareNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        
        for(int i=1 ; i<=(Math.sqrt(n)) ; i++){   
            for(int j=n-i*i ; j<=(Math.sqrt(n)) ; j++){
                if( i*i+j*j ==n ) c++;
                
            }
        }
        if(c!= 0) System.out.println("True");
        else System.out.println("False");
        sc.close();
    }
}