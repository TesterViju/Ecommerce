package Practice;

public class Duplicatearray {
	  public static void main(String[] args) {      
          
	        String [] a = {"Java", "Automation","Test", "Java", "Automation"};   
	          
	        System.out.println("Duplicate elements in given array: ");  
	        
	        for(int i=0; i<a.length; i++)
	        {
	            for(int j=i+1; j<a.length; j++) 
	            {  
	                if(a[i] == a[j])  
	                	
	                    System.out.println(a[i]+",");  
	            }  
	        }  
	    }  
	}  
