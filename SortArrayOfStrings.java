import java.util.Arrays;
import java.util.Scanner;
 
public class SortArrayOfStrings {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("N = ");
		int n = in.nextInt();
		
		String[] strArray = new String[n];
		for (int i = 0; i < strArray.length; i++) {
			System.out.print("Number " + (i+1) + " = ");
			strArray[i] = in.next();
		}
		
		Arrays.sort(strArray);
		for (String string : strArray) {
			System.out.println(string);
		}
	}
}
