package arrays;

public class BubbleSorting {

	public static void main(String[] args) {
		
		int a[] = {5,-1, 6, 8, -3, 6, 8, 7};
		int n = a.length;
		for(int i = 0; i<n-1; i++) {
			
//			optimization
			boolean sorted = true;
					
			for(int j = 0; j<n-1-i; j++) {
				if(a[j + 1] < a[j]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
					sorted = false;
				}
			}
			
			if(sorted) break;
			
		}
		
		for(int item: a) {
			System.out.print(item + " ");
		}
		
	}

}
