class Example{
	public static void main(String args[]){
		myMethod(10);
	}
	static int myMethod(int n){
		if(n==0){
			return n;
		}
		myMethod(n-1);
		System.out.println("myMethod() - n:"+n);
		return 1;
	}
}
