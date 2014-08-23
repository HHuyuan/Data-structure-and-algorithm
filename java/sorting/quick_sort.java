package sorting;

public class quick_sort {
	
	public static void main(String[] args){
		int[] a = {1,5,23,65,35,2,100,68,57,88,123,76};
		start(a);
		for (int i = 0; i < a.length; i++) {		
		     System.out.print(a[i]+" ");
		}
	}
	
	
	public static void start(int[] a){
		quicksort(a, 0, a.length-1);
	}
	
	public static void quicksort(int[] a,int left,int right){
		
		int leftindex = left;
		int rightindex = right;
		
		//取中间元素作为主元
		int middle = a[(leftindex+rightindex)/2];
		
		do {
			while (a[leftindex] < middle && leftindex < right) {
				leftindex++;
			}
			
			while(a[rightindex] > middle && rightindex > left){
				rightindex--;
			}
			if (leftindex<=rightindex) {
				swap(a,leftindex,rightindex);
				leftindex++;
				rightindex--;
			}
		} while (leftindex <= rightindex);
		
		if (leftindex < right) {
			quicksort(a, leftindex, right);
		}
		
		if (rightindex > left) {
			quicksort(a, left, rightindex);
		}
	}
	
	private static void swap(int[] array,int i,int j){
		if (array == null || array.length == 1) {
			return;
		}
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
	

}
