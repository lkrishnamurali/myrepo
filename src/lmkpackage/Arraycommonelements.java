package lmkpackage;

public class Arraycommonelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]a = {1,2,3,4};
	    int[]b = {4,16,11,12,13,22};
	    
	    for(int i = 0; i<a.length; i++) 
	    {
	    	for(int j = 0; j<b.length; j++) 
	    	{
	    		
	    		if(a[i]==b[j])
	    		{
	    			System.out.print(a[i]+" ");
	    		}
	    			
	    		
	    		
	    	}
	    	
	    }
		

	}

}
