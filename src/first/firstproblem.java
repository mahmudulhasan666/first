package first;
import java.util.Scanner;
public class firstproblem {
    public static void main(String[] args){
        int[] myArray = new int[10];
        Scanner in= new Scanner( System.in);
        for(int i=0;i<10;i++){
            myArray[i] = in.nextInt();
        }
        for( int i=9;i>=0; i--){
            System.out.print(myArray[i] + " ");
        }
    }
}
