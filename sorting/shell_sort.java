package sorting;

public class shell_sort {
	
	public static void main(String[] args){
		int[] a = {1,5,23,65,35,2,100,68,57,88,87,76,15};
		shellsort(a);
		for (int i = 0; i < a.length; i++) {		
		     System.out.print(a[i]+" ");
		}
	}
	
	
	public static void shellsort(int[] a){
	   for (int gap = a.length / 2; gap > 0; gap /= 2){
	        for ( int i = gap; i < a.length; i++ ){
	            int tmp = a[i];
	            int j = i;	             
	            for ( ; j >= gap && tmp < a[j-gap] ; j -= gap ){
	                   a[j] = a[j-gap];
	            }
	            a[j] = tmp;
	        }
	   }
	}


}
