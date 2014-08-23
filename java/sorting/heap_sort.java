package sorting;

public class heap_sort {
	
	public static int[] initial_maxheap(int[] a){
        int length = a.length-1;
		
		for (int i = length/2; i > 0; i--) {
			percDown(a, i, length);
		}
		
		return a;		   
	}
	
	public static int[] maxheap_sort(int[] a){
		
		for (int i = a.length-1; i > 1; i--) {		
			int k = a[1];
			a[1] = a[i];
			a[i] = k;
			percDown(a, 1, i-1);
		}
		return a;
	}
	
	
	private static void percDown( int[] a, int i, int n ){   
		 int child;
	     int tmp;
	     
	     for (tmp = a[i] ; leftchild( i ) < n; i = child ) {
	    	 child = leftchild(i);
	    	 if (child<=n-1 && a[child] < a[child+1]) {
				child++;
				
	    	    if (tmp < a[child]) {
	    	    	int l = a[i];
	    		    a[i] = a[child];
	    		    a[child] = l;
			    }	    	    
	    	 }
	    	 
	    	 else if (child<=n-1 && a[child] > a[child+1]) {
	    		 if (tmp < a[child]) {
	    			 int l = a[i];
		    		 a[i] = a[child];
		    		 a[child] = l;				
				    }
			 }	    				
		 }
	 }
		
	private static int leftchild(int i){  
		 return 2*i;
	}    

	
	
	public static void main(String[] args){
		int[] a = {0,1,5,23,65,35,2,100,68,57,87,76};
       
		int[] c = initial_maxheap(a);
		System.out.println("调整为最大堆:");
		for (int i = 1; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println();
		System.out.println("排序后:");
		int[] d = maxheap_sort(c);
		for (int i = 1; i < d.length; i++) {
			System.out.print(d[i]+" ");
		}
  
	}

}
