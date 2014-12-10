package sorting;

public class direct_selection_sort {
	
	public static void main(String[] args){
		int[] a = {1,5,23,65,81,35,2,100,68,57,87,76};
		directselectionsorting(a);
		for (int i = 0; i < a.length; i++) {		
		     System.out.print(a[i]+" ");
		}
	}
	
	public static void  directselectionsorting(int[] a ){
		for (int i = 0; i < a.length; i++) {
			int k = i;
			for (int j = i+1; j < a.length; j++) {
				if (a[k]>=a[j]) {
					k = j;
				}
			}
			if (k != i) {
				int tmp;
				tmp = a[i];
				a[i] = a[k];
				a[k] = tmp;
			}
		}
		
	}

}
