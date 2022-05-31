package Conditional;
import java.util.*;
public class HCF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
	
		int n2 = sc.nextInt();
		int hcf=0;
		for(int i=1;i<=n1||i<=n2;i++) {
			if(n1%i==0&&n2%i==0)
				hcf=i;
		}
				System.out.println(hcf);
	

	}

}

/*
using recursion
static int gcd(int a, int b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b);
    }

*/