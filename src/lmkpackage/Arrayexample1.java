package lmkpackage;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrayexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[3];
		 
        // allowed, however, need to be intialized
        //Test[] array1 = new Test[3];
 
        // not allowed (Uncommenting below line causes
        // compiler error)
        // ArrayList<char> arrL = new ArrayList<char>();
 
        // Allowed
        //ArrayList<Integer> arrL1 = new ArrayList<>();
        //ArrayList<String> arrL2 = new ArrayList<>();
        ArrayList<Object> arrL3 = new ArrayList<>();
		
		ArrayList<Bclass> arrL = new ArrayList<Bclass>();//created class is Bclass
		
		Bclass b=new Bclass();
		
		
        
        arrL.add(b);
        
        arrL3.add(b);
        
        int i =1;
        
        arrL3.add(i);
       
        
       
        
        System.out.println(arrL3);
	
		
		

	}

}
