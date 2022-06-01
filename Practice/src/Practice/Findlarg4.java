package Practice;

public class Findlarg4 {
	public static void main(String[] args) {
		int x = 4550000;
		int y = 9000000;
		int z = 80000000;
		int m = 100000000;
		int n = 1255555000;
		
		if (x>y && x>z && x>m && x>n)
			System.out.println("greatest no.is " +x);
		
		else if (y>x && y>z && y>m && y>n)
		System.out.println("greatest no.is " +y);
		
		else if  (z>m && z>n)
		System.out.println("greatest no.is " +z);
		
    	else if (m>n)
		System.out.println("greatest no.is " +m);
		
    	else 
    		System.out.println("greatest no.is " +n); 	
}
}

