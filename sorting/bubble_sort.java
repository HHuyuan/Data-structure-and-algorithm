package sorting;

public class bubble_sort {
	
	
	public static void bubblesort(int[] data){ 
    	int temp;
    	for(int i=0;i<data.length;i++){ 
   			for(int j=data.length-1;j>i;j--){
    			if(data[i]<data[j]){
     				temp =data[i];
     				data[i] = data[j];
     				data[j] = temp;
    			}
   			}
  		}
 	}

	public static void main(String[] args){
		int[] a = {1,5,23,65,35,2,100,68,57,87,76};
		bubblesort(a);
		for (int i = 0; i < a.length; i++) {		
		     System.out.print(a[i]+" ");
		}
	}
}
