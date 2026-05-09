class demo {
	
	static int max(int[] arr) {
		int max =0;
		for(int i=0;i<arr.length;i++)
		if( arr[i]>max){
			max =arr[i];
		}
		//System.out.printl(max);
		return max;
	}
	
	static int indexOf(int[] arr, int value){
		for(int i=0; i<arr.length;i++){
			if(arr[i] == value) {
				return i;
			}
		}
		return -1; // default case no value found
	}
	
	public static void main(String[] args) {
		int[] arr = {1,5,78,6,51,2,8,39,54};
	
		System.out.println("Index of 51: " + indexOf(arr, 51));
		System.out.println("Max : " + max(arr));
    }
}



