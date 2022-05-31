package Conditional;

import java.util.Scanner;

public class Vowelsandconsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase();    
        int vcount=0,consonants=0;
        for(int i = 0; i < str.length(); i++) {  
        	if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {   
        		vcount++;
        	}
        	else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {
        		consonants++;
        	}

	}
        System.out.println("Number of vowels: " + vcount);    
        System.out.println("Number of consonants: " + consonants ); 

}
}
