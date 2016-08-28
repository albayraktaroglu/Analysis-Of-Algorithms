
public class ShellSort {

    static void Sort(int []array, int number_of_elements)
	{
	        int increment, temp,j ;
	        for(increment = number_of_elements/2 ; increment > 0 ; increment /= 2)
	        {
	                for(int i = increment; i<number_of_elements; i++)
	                {
	                        temp = array[i];
	                        for(j = i; j >= increment ; j-=increment)
	                        {
	                        	
	                        	for(int k=0 ; k<array.length ; k++)
	 	                        {
	 	                        	System.out.print(array[k]+" ");
	 	                        }
	                        	// understanding indexes 
	                        	System.out.println("Increment with-"+increment+"  "+array[j-increment]+" vs "+temp+" (j-increment) "+ (j-increment)+ "th Compare with "+j+"th" );
	                        	
	                        	
	                                if(temp < array[j-increment])
	                                {
	                                        array[j] = array[j-increment];
	                                }
	                                else
	                                {
	                                	System.out.print("break\n");
	                                        break;
	                                }
	                                    
	                        }
	                        array[j] = temp;
	                        
	                        for(int k=0 ; k<array.length ; k++)
	                        {
	                        	System.out.print(array[k]+" ");
	                        }
	                        System.out.print("\n");
	                }
	        }
	        
	        
	        // print result 
	        for(int i=0 ; i<array.length ; i++)
	        {
	        	System.out.print(array[i]+" ");
	        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array = {4,7,3,1,0,9,10,2};
		
		System.out.println("Before____________");
		// print result 
        for(int i=0 ; i<array.length ; i++)
        {
        	System.out.print(array[i]+" ");
        }
        System.out.println("\nAfter____________");
		Sort(array,array.length);

	}

}
