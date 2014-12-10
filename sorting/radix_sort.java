package sorting;

public class radix_sort {
	
	 public static void main(String[] args){   
	      int[] a = {23, 963, 234, 1, 61, 798, 479,1234, 310, 617, 892};    
	      int[] b = radixSort(a);	        
	      for (int i = 0; i < b.length; i++) {		
			   System.out.print(b[i]+" ");
	      }	        
	 }   
	 
	 public static int[] radixSort(int[] a){   
	      int[] b = new int[a.length];   	           
	      for(int i=0; i<a.length; i++){   
	          b[i] = a[i];   
	      }      
	      for(int i=1; i<=a.length; i++){ 
	          b = countSort(b, i);   
	      }
	           
	      return b;   
	 } 
	 
	 public static int[] countSort(int[] a, int k){   
	      int[] b = new int[a.length];   
	      int[] c = new int[10];   
	           
	      for(int i=0; i<b.length; i++){  
	          b[i] = 0; 
	      } 
	           
	      for(int i=0; i<c.length; i++){   
	          c[i] = 0;   
	      }
	        
	      int s = 1;   
	      for(int i=0; i<k; i++){   
	          s = s * 10;   
	      }
	        
	      int temp1 = 0;   
	        
	      for(int i=0; i<a.length; i++){   
	          temp1 = a[i]%s;   
	          temp1 = temp1 * 10 / s;                  
	          c[temp1] = c[temp1] + 1;   
	      }   
	           
	      for(int i=1; i<c.length; i++){   
	          c[i] = c[i] + c[i-1];   
	      }
	        
	      int temp2 = 0;   
	        
	      for(int i=a.length-1; i>=0; i--){   
	          temp1 = a[i];   
	          temp2 = a[i]%s;   
	          temp2 = temp2 * 10 / s;            
	          b[c[temp2]-1] = temp1;   
	          c[temp2] = c[temp2] - 1;   
	      }   
	           
	      return b;   
	    }   

}
