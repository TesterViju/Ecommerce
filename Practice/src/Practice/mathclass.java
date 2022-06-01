package Practice;

import java.util.Scanner;

public class mathclass {
	
public static void main(String args[]) {
        
        Scanner z = new Scanner(System.in); 
			System.out.print("Enter First Number: ");
			int a = z.nextInt();
			System.out.print("Enter Second Number: ");
			int b = z.nextInt();
			System.out.print("Enter Third Number: ");
			int c = z.nextInt();
			
			int g = Math.min(a, b);
			g = Math.min(g, c);
			
			System.out.println("Smallest Number = " + g);
		}
    }



