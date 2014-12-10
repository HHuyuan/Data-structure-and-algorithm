package sorting;

public class merge_sort {
	
	public static void main(String[] args){
		int[] a = {1,5,23,65,35,2,68,57,88,87,76};
		
		mergesort(a);
		
		for (int i = 0; i < a.length; i++) {		
		     System.out.print(a[i]+" ");
		}
	}
	
	public static void mergesort(int[] a){
		int length = a.length;
		if (length > 1 ) {	
			int[] firsthalf = new int[length/2];
			System.arraycopy(a, 0, firsthalf, 0, length / 2);  
			mergesort(firsthalf);
			
			int[] secondhalf = new int[length-length/2];
			System.arraycopy(a,  length / 2, secondhalf,0, length-length/2);
			mergesort(secondhalf);
			
			int[] temp = merge(firsthalf, secondhalf);
			System.arraycopy(temp, 0, a, 0, temp.length);
		}
	}

	
	private static int[] merge(int[] array1,int[] array2){
		int length1 = array1.length;
		int length2 = array2.length;
		int[] resultarray = new int[length1+length2];
				
		int indexofarray1 = 0;
		int indexofarray2 = 0;
		int indexofresultarray = 0;
		
		while(indexofarray1 < length1 && indexofarray2 < length2){
			if (array1[indexofarray1] <= array2[indexofarray2]) {
				resultarray[indexofresultarray] = array1[indexofarray1];
				indexofarray1++;
				indexofresultarray++;
			}else{
				resultarray[indexofresultarray] = array2[indexofarray2];
				indexofarray2++;
				indexofresultarray++;
			}
		}
		
		while(indexofarray1 < length1){
			resultarray[indexofresultarray] = array1[indexofarray1];
			indexofarray1++;
			indexofresultarray++;
		}
		
		while(indexofarray2 < length2){
			resultarray[indexofresultarray] = array2[indexofarray2];
			indexofarray2++;
			indexofresultarray++;
		}
		return resultarray;
	}

}
