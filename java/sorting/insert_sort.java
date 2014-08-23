package sorting;

public class insert_sort {

	
	public static void main(String[] args){
		int[] a = {1,5,23,65,35,2,68,57,88,87,76};

		insertionSort(a);
		
		for (int i = 0; i < a.length; i++) {		
		     System.out.print(a[i]+" ");
		}
		
	}
	public static void insertionSort( int[] a ){   
		int j;
	    for ( int p = 1; p < a.length; p++ ){    
	    	int tmp = a[p];
	        for ( j = p; j > 0 && tmp<a[j-1]; j-- ){
	             a[j] = a[j-1];
	        }
	            a[j] = tmp;       
	    }
	 } 


}
