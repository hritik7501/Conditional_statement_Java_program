//Take integer inputs till the user enters 0 and print the largest number from all.

package Conditional;
import java.util.*;
public class largestofmaxnotillget0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		int large=0;
		while((num =sc.nextInt())!=0) {
		large = sc.nextInt();
			if(num>large)
				large=num;
				
		}
		System.out.println(large);
		

	}

}
