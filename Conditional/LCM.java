package Conditional;
import java.util.*;
public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int i;
		int a = (n1>n2)?n1:n2;
	
		for(i = a ; i <= n1*n2 ; i = i + a)  
		{  
		//returns true if both conditions are true  
		if(i % n1 == 0 && i % n2 == 0)  
		break;  
		}  
		System.out.println(i);

	}

}
/*
 using gcd 
 lcm = (n1*n2)/gcd;
 */ 
