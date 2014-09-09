import java.util.Scanner;
 
public class SumTwoNumbers {
 
     public static void main(String []args){
        int numberOne, numberTwo;
    	
		Scanner in = new Scanner(System.in);		
		numberOne = in.nextInt();
		numberTwo = in.nextInt();
		
		System.out.println("The sum is:" + (numberOne + numberTwo));
     }
}
