
public class BubbleSort_JAVA {
	public static void main(String args[]) {
		
		int arr[] = {15,25,64,10,2,6,1,98,12,94,111,55}; //creat a new array and enter some integers
		
		for(int i=arr.length-1 ; i>0 ; i--) {
			for(int j=0 ; j<i ; j++) {
				
				if(arr[j]>arr[j+1]) {
					
					int temp = arr[j];
					arr[j]=arr[j+1];     // swap for arr[j] & arr[j+1] ==> small --> big 
					arr[j+1]=temp;
				}
			}
		}
		for(int k:arr) {
			System.out.println(k);  // you can check the result
		}
	}
}
