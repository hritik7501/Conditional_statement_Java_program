//Take integer inputs till the user enters 0 and print the sum of all numbers 
package Conditional;
import java.util.*;
public class Print_sum_tillgetzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		while((num = sc.nextInt())!= 0) {
			sum = sum+num;
			
		}
		System.out.println(sum);

	}

}
