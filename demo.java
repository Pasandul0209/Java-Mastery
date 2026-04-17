import java.util.*;
class demo{
   public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1 for DecimalToBinary");
		System.out.println("Enter 2 for DecimalToOctal");
		System.out.println("Enter 3 for DecimalToHexa");
		System.out.println("Enter 99 for Exit");
		//int x = input.nextInt();
		System.out.println();
		System.out.print("Select the converter: ");
		int x = input.nextInt();
		System.out.println();
		if(x==1){
			System.out.println("DecimalToBinary Converter"); // 1
		}else if(x==2){
			System.out.println("DecimalToOctal Converter"); // 2
		}else if(x==3){
			System.out.println("DecimalToHexa Converter"); // 3
		}else{
		System.out.println("Invalid Input...");
		}
	}
}   
