package sorting;

public class tournament_sort {
	
	public static void main(String[] args){
		int[] a = {1,5,23,65,35,2,100,68,57,88,87,76,15};
		
		tournament_sort tournament_sort = new tournament_sort();
		tournament_sort.tournamentsort(a);
		
		for (int i = 0; i < a.length; i++) {		
		     System.out.print(a[i]+" ");
		}
	}
	
	public void tournamentsort(int[] a){
		int nNodes = 1;
		int nTreeSize;
		
		
		while(nNodes < a.length){
			nNodes *= 2;
		}
		
		nTreeSize = 2 * nNodes - 1;
		Node[] nodes = new Node[nTreeSize];
		
		int i;
		int idx;
		
		for( i = nNodes - 1; i < nTreeSize; i++){ 
			idx = i - (nNodes - 1); 
			if(idx < a.length){
				nodes[i] = new Node(a[idx], i); 
			}else {
				nodes[i] = new Node(Integer.MAX_VALUE, -1);
			}
		}
		
		for (i = nNodes - 2; i >= 0; i--) {
	
			nodes[i] =  new Node();
			if(nodes[i * 2 + 1].data < nodes[i * 2 + 2].data)  {
				nodes[i] = nodes[i*2 + 1];
			}else {
				 nodes[i] = nodes[i*2 + 2];
			}
		}
		
		for (i = 0; i < a.length; i++) {
			a[i] = nodes[0].data;
			nodes[nodes[0].id].data = Integer.MAX_VALUE; 
			Adjust(nodes, nodes[0].id);
		}
	
	}
	
	private static void Adjust(Node[] data, int idx){
		 while(idx != 0){
			 if(idx % 2 == 1){
				 if(data[idx].data < data[idx + 1].data){
					 data[(idx - 1)/2] = data[idx];
				 }else {
					 data[(idx-1)/2] = data[idx + 1];
				 }
				 idx = (idx - 1)/2;
			 }
			 else {
				 if(data[idx-1].data < data[idx].data){
					 data[idx/2 - 1] = data[idx-1];
				 }else {
					 data[idx/2 - 1] = data[idx];  
				 }
				 idx = (idx/2 - 1);
			 }
		 }
		
	}
	
	
	
	
	
	
class Node{
		
		public int data;
		public int id;
		
		
		public Node(int _data,int _id){
			data = _data;
			id = _id;
		}
		
		public Node(){
			
		}
		
		
	}
	
}
