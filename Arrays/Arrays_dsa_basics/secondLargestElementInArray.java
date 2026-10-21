public class secondLargestElementInArray {
    public static int secondLargestElementNaive(int[] arr, int n) { 
		if(n<2) return -1;
		int largest=0;
		int slargest=-1;
		for(int i=1;i<n;i++){
			if(arr[i]>arr[largest]){
				largest=i;
			}
		}

		for(int i=0;i<n;i++){
			if(arr[i]!=arr[largest]){
				if(slargest==-1||arr[i]>arr[slargest])
				slargest=i;
			}
		}
		return slargest!=-1? arr[slargest]:-1;
	}

    public static int secondLargestElementEfficient(int arr[],int n){ //TC:O(n)
        if(n<2) return -1;
		int largest=0;
		int slargest=-1;
		for(int i=1;i<n;i++){
			if(arr[i]>arr[largest]){
				slargest=largest;
				largest=i;
			}
			else if(arr[i]!=arr[largest]){
				if(slargest==-1 || arr[i]>arr[slargest]){
					slargest=i;
				}
			}
		}
		return slargest!=-1? arr[slargest]:-1;
    }

    
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        System.out.println("Second Largest: " + secondLargestElementNaive(arr,n)); // Output: 40
        System.out.println("Second Largest: " + secondLargestElementEfficient(arr,n));
    }
    
}
