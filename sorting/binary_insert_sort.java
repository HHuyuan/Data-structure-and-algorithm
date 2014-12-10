package sorting;

public class binary_insert_sort {
	
	public static void main(String[] args){
		int[] a = {1,5,23,65,35,2,100,68,57,88,87,76};
		start(a);
		for (int i = 0; i < a.length; i++) {		
		     System.out.print(a[i]+" ");
		}
	}
	
	
	public static void start(int[] a){
		for (int i = 1; i < a.length; i++) {
			binaryinsertsort(a, i);
		}	
	}
	
	public static void binaryinsertsort(int[] a,int i){
		int left = 0,right = i-1;
		int temp = a[i];
		while (left<=right) {
			int middle=(left+right)/2;
			if (temp<a[middle]) {
				right= middle-1;
			}else {
				left = middle+1;
			}
		}
		for (int k=i-1;k>=left;k--){
			a[k+1] = a[k];
		}
		a[left] = temp;
	}

}
