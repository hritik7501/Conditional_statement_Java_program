package Conditional;
import java.util.*;
public class leetcodeproblem1281 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int sum=0;
     int pro=1;
     int temp=n;
     while(temp>0) {
    	 int rem = temp%10;
    	 sum=sum+rem;
    	 pro=pro*rem;
    	 temp=temp/10;
     }
     System.out.println(pro-sum);
	}

}
/*
Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15
*/