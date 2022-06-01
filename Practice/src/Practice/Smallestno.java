package Practice;

public class Smallestno {
	public static void main(String[] args) {
		int x = 4000;
		int y = 900;
		int z = 80000;
		int m = 52000;
		
		
		if (x<y )
		{
			if (x<z)
			{
				if (x<m)
				System.out.println("Smallest no.is " +x);
			    else 
			    System.out.println("Smallest no.is " +m);
			}
		}
    	else
    	{
    		if (y<z)
    		{
    			if (y<m)
    				System.out.println("Smallest no.is " +y); 	
        		else
        			System.out.println("Smallest no.is " +m);
    		}
    		else
    		{
    			if (z<m)
    				System.out.println("Smallest no.is " +z); 	
        		else
        			System.out.println("Smallest no.is " +m);
    		}
    		
    	}
	}
}





