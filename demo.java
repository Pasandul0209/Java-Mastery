import java.util.*;
class demo{
	public static int withHoldingtax(){
		Scanner input=new Scanner(System.in);
			System.out.println("");
			System.out.println("\t\t\tWithhodling tax\t\t\t");
			System.out.println("");
			//int x2=input.nextInt();
			System.out.println("[1] calculate rent tax");
			System.out.println("[2] calculate bank interest tax");
			System.out.println("[3] calculate dividend tax");
			System.out.print("Enter what you wanna do : ");
			int x2=input.nextInt();
			int x5= x2;
			return x5;
			
	}
	public static void payabletax(){
		Scanner input=new Scanner(System.in);
			System.out.println("");
			System.out.println("\t\t\tpayable  tax\t\t\t");
			System.out.println("");
			System.out.print("Enter what you wanna do : ");
			
	}
	
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Hello User!\n");
		System.out.println("///\t\t\tTax Calculator\t\t\t\\\\\\");
		System.out.println("");
		System.out.println("");
		System.out.println("[1] Calculate withholfing tax");
		System.out.println("[2] calculate payable tax");
		System.out.println("[3] calculate income tax");
		System.out.println("[4] calculate socila security...");
		System.out.println("[5] calculate leasing payment");
		System.out.println("");
		System.out.print("Enter what you wanna do : ");
		int x1=input.nextInt();
		switch(x1){
			case 1 : {
						int x6=withHoldingtax();
						System.out.println("return value "+x6);
						break;
					}
			case 2 : {
						payabletax();
						break;
					}
			default :{
						System.out.println("\n\nInvalid input! enter a valid number...\n");
						main(new String[]{""});
					}
					

	}
}
}
