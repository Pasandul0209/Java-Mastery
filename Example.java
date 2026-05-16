class Example{
	public static void main(String args[]){
		myMethod(10);
	}
	static int myMethod(int n){
		if(n==0){
			return n;
		}
		myMethod(n-1);
		System.out.println("myMethod() - n : "+n);
		return 1;
	}
}

import java.util.*;
class iFriend{
	public final static void clearConsole(){
		try{   
			final String os = System.getProperty("os.name");
			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
			}else {
				System.out.print("\033[H\033[2J");
				System.out.flush();
			}
		}catch (final Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static boolean num_check(String a){
		boolean wrong_num=false;
		if(a.length()!=10|a.charAt(0)!='0'){
			wrong_num=true;
		}
							
		L:for (int i = 0; i < a.length()-1; i++){
		char x=a.charAt(i);
		switch (x){
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				break;
			default:
				wrong_num=true;
				break L;
			}
		}
		return wrong_num;	
	}
	
	
	public static boolean birthCheck(String a){
		int yr_num=0,mon_num=0,day_num=0;
		String yr_temp="",mon_temp="",day_temp="";
		if((a.charAt(4)=='-')&(a.charAt(7)=='-')&(a.length()==10)){
			for (int i = 0; i < 4; i++){
				char ch=a.charAt(i);
				yr_temp+=ch;
			}
			yr_num=Integer.parseInt(yr_temp);
			for (int i = 5; i < 7; i++){
				char ch=a.charAt(i);
				mon_temp+=ch;
			}
			mon_num=Integer.parseInt(mon_temp);
			for (int i = 8; i < 10; i++){
				char ch=a.charAt(i);
				day_temp+=ch;
			}
			day_num=Integer.parseInt(day_temp);
			if(yr_num>2024|yr_num<1000) return true;
			if(yr_num==2024){
				if(mon_num>4) return true;
				if(mon_num==4){
					if(day_num>27|day_num<0) return true;
				}
			}
			if(mon_num>12|mon_num<1) return true;
			switch(mon_num){
				case 4:
				case 6:
				case 9:
				case 11:
					if(day_num<0|day_num>30) return true;
					break;
				case 2:
					if(yr_num%100==0){
						if(yr_num%400==0){
							if(day_num>29|day_num<0) return true;
						}else{
							if(day_num>28|day_num<0) return true;
						}
					}else{
						if(yr_num%4==0){
							if(day_num>29|day_num<0) return true;
						}else{
							if(day_num>28|day_num<0) return true;
						}
					}
					break;
				default:
					if(day_num<0|day_num>31) return true;
			}
			return false;
		}
		return true;
	}
	
	
	public static String[] incrementStringArr(String[] a,String A){
		String[] b=new String[a.length+1];
		for (int i = 0; i < a.length; i++){
			b[i]=a[i];
		}
		b[a.length]=A;
		a=b;
		return a;
	}
	
	
	public static double[] incrementDoubleArr(double[] a,double A){
		double[] b=new double[a.length+1];
		for (int i = 0; i < a.length; i++){
			b[i]=a[i];
		}
		b[a.length]=A;
		a=b;
		return a;
	}
	
	
	public static int[] incrementIntArr(int[] a,int A){
		int[] b=new int[a.length+1];
		for (int i = 0; i < a.length; i++){
			b[i]=a[i];
		}
		b[a.length]=A;
		a=b;
		return a;
	}
	
	
	public static int search(String A){
		boolean b=false;
		b=num_check(A);
			
		int i=0;
		IF:if(b){
			for (; i < nameArr.length; i++){
				if(nameArr[i].equals(A)){
					break IF;
				}
			}
			System.out.print("\n\n\tInvalid Data!");
			return -1;
			
		}else{
			for (; i < contactArr.length; i++){
				if(contactArr[i].equals(A)){
					break IF;
				}
			}
			System.out.print("\n\n\tInvalid Data!");
			return -1;
		}	
		System.out.printf("\n\tContact ID        : C%04d\n",contact_idArr[i]);
		System.out.println("\tName              : "+nameArr[i]);
		System.out.println("\tPhone Number      : "+contactArr[i]);
		System.out.println("\tCompany Name      : "+companyArr[i]);
		System.out.printf("\tSalary            : %.2f\n",salaryArr[i]);
		System.out.println("\tB'day(YYYY-MM-DD) : "+b_dayArr[i]);		
		return i;
	}
	
	
	public static String[] delString(String[] a,int A){
		String[] b=new String[a.length-1];
		for (int i = 0; i < A; i++){
			b[i]=a[i];
		}
		for (int i = A; i < b.length; i++){
			b[i]=a[i+1];
		}
		return b;
	}
	
	
	public static int[] delInt(int[] a,int A){
		int[] b=new int[a.length-1];
		for (int i = 0; i < A; i++){
			b[i]=a[i];
		}
		for (int i = A; i < b.length; i++){
			b[i]=a[i+1];
		}
		return b;
	}
	
	
	public static double[] delDouble(double[] a,int A){
		double[] b=new double[a.length-1];
		for (int i = 0; i < A; i++){
			b[i]=a[i];
		}
		for (int i = A; i < b.length; i++){
			b[i]=a[i+1];
		}
		return b;
	}
	
	
	public static char[] ArrStringtoChar(char[] a,String b){
		for (int j = 0; j < b.length(); j++){
			a[j]=b.charAt(j);
		}
		return a;
	}
	
	
	public static char[] capitaltoSimple(char[] a){
		for (int j = 0; j < a.length; j++){
			if(a[j]>96 & a[j]<123){
				a[j]-=32;
			}
		}
		return a;
	}
	
	
	public static void orderreplace(int i){
		int i1=contact_idArr[i+1];
		contact_idArr[i+1]=contact_idArr[i];
		contact_idArr[i]=i1;						
		
		String s1=nameArr[i+1];
		nameArr[i+1]=nameArr[i];
		nameArr[i]=s1;
		
		String s2=contactArr[i+1];
		contactArr[i+1]=contactArr[i];
		contactArr[i]=s2;
		
		String s3=companyArr[i+1];
		companyArr[i+1]=companyArr[i];
		companyArr[i]=s3;
		
		double d1=salaryArr[i+1];
		salaryArr[i+1]=salaryArr[i];
		salaryArr[i]=d1;
		
		String s4=b_dayArr[i+1];
		b_dayArr[i+1]=b_dayArr[i];
		b_dayArr[i]=s4;
	}
	
	
	public static int[] stringExtractArr(int a, int b, int[] A){
		for(int j=0; j< b_dayArr.length; j++){
			String temp="";
			for (int i=a; i < b; i++){
				temp+=b_dayArr[j].charAt(i);
			}
			A[j]=Integer.parseInt(temp);			
		}			
		return A;
	}
	
	
	public static int c_id=0;
	public static char YorN='0';
	public static int[] contact_idArr=new int[0];
	public static String[] nameArr=new String[0];
	public static String[] contactArr=new String[0];
	public static String[] companyArr=new String[0];
	public static String[] b_dayArr=new String[0];
	public static double[] salaryArr=new double[0];
	

	public static void add_contact(){
		Scanner input=new Scanner(System.in);
		do{
			clearConsole();
			System.out.println("+------------------------------------------------------+");
			System.out.println("|               Add Contact to the list                |");
			System.out.println("+------------------------------------------------------+\n\n");
			
			c_id++;
			System.out.printf(" C%04d\n",c_id);
			System.out.println("=======");
		
			System.out.print("\nName              : ");
			String name=input.nextLine();
					
			boolean b=false;
			do{
				System.out.print("Phone Number      : ");
				String num=input.nextLine();							
				b=num_check(num);
				if(b){
					System.out.println("\n\tInvalid Phone Number...\n");
					System.out.print("Do you want to add phone number again (Y/N) : ");
					YorN=input.next().charAt(0);
					input.nextLine();
					System.out.print("\n");
					if(YorN=='Y') continue;
					if(YorN=='N') main(null);		
					System.out.println("Invalid Option !");
					System.exit(0);					
				}else{
					contactArr=incrementStringArr(contactArr,num);
				}
			}while(b);
			
			System.out.print("Company Name      : ");
			String comp=input.nextLine();
			System.out.print("Salary            : ");
			double salary=input.nextDouble();
			input.nextLine();
			
			do{
				System.out.print("B'day(YYYY-MM-DD) : ");
				String birth=input.nextLine();
				b=birthCheck(birth);
				if(b){
					System.out.println("\n\tInvalid Birthday...\n");
					System.out.print("Do you want to input birthday again (Y/N) : ");
					YorN=input.next().charAt(0);
					input.nextLine();
					System.out.print("\n");
					if(YorN=='Y') continue;
					if(YorN=='N') main(null);		
					System.out.println("Invalid Option !");
					System.exit(0);					
				}else{
					b_dayArr=incrementStringArr(b_dayArr,birth);	
				}					
			}while(b);
			
			contact_idArr=incrementIntArr(contact_idArr,c_id);
			nameArr=incrementStringArr(nameArr,name);
			companyArr=incrementStringArr(companyArr,comp);
			salaryArr=incrementDoubleArr(salaryArr,salary);
			
			System.out.println("\n\tContact has been added successfully...\n");
			System.out.print("\nDo you want to add another Contact (Y/N) : ");
			YorN=input.next().charAt(0);
			input.nextLine();
			if(YorN=='Y') continue;
			if(YorN=='N') main(null);

		}while(true);
	}
	
	
	public static void update_list(){
		Scanner input=new Scanner(System.in);
		do{			
			clearConsole();						
			System.out.println("+------------------------------------------------------+");
			System.out.println("|                     UPDATE List                      |");
			System.out.println("+------------------------------------------------------+\n\n");
		
			System.out.print("Search Contact by Name or Phone Number - ");
			String in=input.nextLine();
			
			int i=search(in);
			if(i==-1) System.exit(0);	
			
			System.out.println("\n\nWhat do you want to update...\n");
			System.out.println("\t[01] Name");
			System.out.println("\t[02] Phone Number");
			System.out.println("\t[03] Company Name");
			System.out.println("\t[04] Salary\n\n");
			System.out.print("Enter an option to continue -> ");
			int update_opt=input.nextInt();
			System.out.print("\033[2A"); 
			System.out.print("\033[0J");
			input.nextLine();
			switch (update_opt){
				case 1:
					System.out.println(" Update Name");
					System.out.println("=============");
					System.out.print("\nInput new name - ");
					nameArr[i]=input.nextLine();
					break;
					
				case 2:	
					System.out.println(" Update Phone Number");
					System.out.println("=====================");
					do{
						System.out.print("\nInput new phone number - ");
						String temp=input.nextLine();						
						if(num_check(temp)){
							System.out.println("Invalid Phone Number...");
							System.out.print("Do you want to add phone number again (Y/N) : ");
							YorN=input.next().charAt(0);
							System.out.print("\n");
							if(YorN=='Y') continue;
							if(YorN=='N') main(null);		
							System.out.println("Invalid Option !");	
							System.exit(0);					
						}else{
							contactArr[i]=temp;
						}
						break;
					}while(true);
					break;
					
				case 3:
					System.out.println(" Update Company Name");
					System.out.println("=====================");
					System.out.print("\nInput new company name - ");
					companyArr[i]=input.nextLine();
					break;
				
				case 4:
					System.out.println(" Update Salary");
					System.out.println("===============");
					System.out.print("\nInput new salary - ");
					salaryArr[i]=input.nextDouble();
					break;
					
				default:
					System.out.println("Invalid Option !");
					System.exit(0);					
			}
			System.out.println("\n\tContact has been updated succesfully..");
			System.out.print("\n\nDo you want to update another Contact (Y/N) : ");
			YorN=input.next().charAt(0);
			input.nextLine();
			if(YorN=='Y') continue;
			if(YorN=='N') main(null);					 	
		}while(true);	
	}
	
	
	public static void del_contact(){
		Scanner input=new Scanner(System.in);
		do{
			clearConsole();						
			System.out.println("+------------------------------------------------------+");
			System.out.println("|                     DELETE Contact                   |");
			System.out.println("+------------------------------------------------------+\n\n");
			
			System.out.print("Search Contact by Name or Phone Number - ");
			String in=input.nextLine();
			
			int i=search(in);
			if(i==-1) System.exit(0);					
			
			System.out.println("\nDo you want to delete this Contact (Y/N) : ");
			YorN=input.next().charAt(0);
			switch(YorN){
				case 'Y':
					contactArr=delString(contactArr,i);
					nameArr=delString(nameArr,i);
					companyArr=delString(companyArr,i);
					contact_idArr=delInt(contact_idArr,i);
					salaryArr=delDouble(salaryArr,i);
					break;
				case 'N':
					main(null);
				default:	
					System.out.println("Invalid Option !");
					System.exit(0);					
			}
			
			System.out.println(Arrays.toString(contact_idArr));
			System.out.println(Arrays.toString(contactArr));
			System.out.println(Arrays.toString(nameArr));
			System.out.println(Arrays.toString(salaryArr));
			System.out.println(Arrays.toString(companyArr));
					
			System.out.println("\n\tContact has been deleted succesfully..");
			System.out.print("\n\nDo you want to delete another Contact (Y/N) : ");
			YorN=input.next().charAt(0);
			input.nextLine();
			if(YorN=='Y') continue;
			if(YorN=='N') main(null);
		}while(true);		
	}
	
	
	public static void search_contact(){
		Scanner input=new Scanner(System.in);
		do{
			clearConsole();						
			System.out.println("+------------------------------------------------------+");
			System.out.println("|                     SEARCH Contact                   |");
			System.out.println("+------------------------------------------------------+\n\n");
			
			System.out.print("Search Contact by Name or Phone Number - ");
			String in=input.nextLine();
			
			int i=search(in);
			if(i==-1){
				System.out.print("\033[2A"); 
				System.out.print("\033[0J"); 
				System.out.println("\n\tNo contact found for "+in);			
				System.out.print("\n\nDo you want try a new search (Y/N) : ");			
				YorN=input.next().charAt(0);
			}else{
				System.out.print("\nDo you want to search another contact(Y/N) : ");			
				YorN=input.next().charAt(0);
			}
			input.nextLine();
			if(YorN=='Y') continue;
			if(YorN=='N') main(null);
		}while(true);	
	}
	
	
	public static void list_contact(){
		Scanner input=new Scanner(System.in);
		do{
			clearConsole();						
			System.out.println("+----------------------------------------------+");
			System.out.println("|                  SORT Contact                |");
			System.out.println("+----------------------------------------------+\n\n");
			
			System.out.println("\t[01] Sorting by Name\n");
			System.out.println("\t[02] Sorting by Salary\n");
			System.out.println("\t[03] Sorting by Birthday\n\n");
			
			System.out.print("Enter an option to continue -> ");
			int sort_option=input.nextInt();
			switch (sort_option){
				case 1:
					sortName();
					break;
					
				case 2:
					sortSalary();
	 				break;
					
				case 3:
					sortBirthDay();
					break;
					
				default:
					System.out.println("Invalid Option !");
					System.exit(0);	
			}
			
		}while(true);	
	}
	
	
	public static void sortName(){
		for (int k = 0; k < nameArr.length-1; k++){		
			for (int i = 0; i < nameArr.length-1-k; i++){
				char[] temp1=new char[nameArr[i].length()];
				char[] temp2=new char[nameArr[i+1].length()];
				
				temp1=ArrStringtoChar(temp1,nameArr[i]);
				temp2=ArrStringtoChar(temp2,nameArr[i+1]);
				
				temp1=capitaltoSimple(temp1);
				temp2=capitaltoSimple(temp2);			
				
				int min=nameArr[i].length();
				if(min>nameArr[i+1].length()) min=nameArr[i+1].length();
				
				L1:for (int j = 0; j < min; j++){
					if(temp1[j]>temp2[j]){
						orderreplace(i);						
						break L1;
					}else if(temp1[j]==temp2[j]){
						continue;
					}else{
						break L1;	
					}
				}			
			}
		}
		clearConsole();
		System.out.println("\n                +-----------------------------------------------+");
		System.out.println("                |               LIST Contacts by Name           |");
		System.out.println("                +-----------------------------------------------+\n\n");
		sort_table();
	}
	
	
	public static void sortSalary(){
		for (int i = 0; i < salaryArr.length-1; i++){		
			for (int j = 0; j < salaryArr.length-1-i; j++){
				if(salaryArr[j]>salaryArr[j+1]){
					orderreplace(j);
				}
			}
		}	
		clearConsole();
		System.out.println("\n                +-----------------------------------------------+");
		System.out.println("                |             LIST Contacts by Salary           |");
		System.out.println("                +-----------------------------------------------+\n\n");
		sort_table();
	}
	
	
	public static void sortBirthDay(){
		int[] year=new int[b_dayArr.length];
		int[] month=new int[b_dayArr.length];
		int[] day=new int[b_dayArr.length];
	
		year=stringExtractArr(0,4,year);
		month=stringExtractArr(5,7,month);
		day=stringExtractArr(8,10,day);		
		
		for(int j=0;j< b_dayArr.length-1;j++){
			for (int i = 0; i < b_dayArr.length-1-j; i++){
				if(year[i]>year[i+1]){
					orderreplace(i);				
				}else if(year[i]==year[i+1]){
					if(month[i]>month[i+1]){
						orderreplace(i);
					}else if(month[i]==month[i+1]){
						if(day[i]>day[i+1]){
							orderreplace(i);
						}
					}
				}
			}
		}
		clearConsole();
		System.out.println("\n                +-----------------------------------------------+");
		System.out.println("                |           LIST Contacts by Birthday           |");
		System.out.println("                +-----------------------------------------------+\n\n");
		sort_table();
	}
	
	
	public static void sort_table(){
		Scanner input=new Scanner(System.in);
		do{
			System.out.println("+---------------+---------------+----------------+--------------+---------------+--------------+");
			System.out.println("|  Contact ID   |     Name      |  Phone Number  |    Company   |    Salary     |   Birthday   |");
			System.out.println("+---------------+---------------+----------------+--------------+---------------+--------------+");
			for (int i = 0; i < nameArr.length; i++){		
				System.out.printf("|  C%04d        |  %-13s|   %s   |    %-10s|  %-13.2f|  %s  |\n",contact_idArr[i],nameArr[i],contactArr[i],companyArr[i],salaryArr[i],b_dayArr[i]);
			}
			System.out.println("+---------------+---------------+----------------+--------------+---------------+--------------+\n\n");
			
			do{
				System.out.print("Do you want to go to homepage (Y/N) : ");
				YorN=input.next().charAt(0);
				if(YorN=='Y') main(null);
				if(YorN=='N'){
					System.out.print("\033[1A"); 
					System.out.print("\033[0J");
					continue;
				}
				System.out.println("\nInvalid Option !");
				System.exit(0);	
			}while(true);
		}while(true);
	}
	
	
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		clearConsole();
		System.out.println("\n           /$$ /$$$$$$$$ /$$$$$$$  /$$$$$$ /$$$$$$$$ /$$   /$$ /$$$$$$$");
		System.out.println("           |__/| $$_____/| $$__  $$|_  $$_/| $$_____/| $$$ | $$| $$__  $$");
		System.out.println("            /$$| $$      | $$  \\ $$  | $$  | $$      | $$$$| $$| $$  \\ $$");
		System.out.println("           | $$| $$$$$   | $$$$$$$/  | $$  | $$$$$   | $$ $$ $$| $$  | $$");
		System.out.println("           | $$| $$__/   | $$__  $$  | $$  | $$__/   | $$  $$$$| $$  | $$");
		System.out.println("           | $$| $$      | $$  \\ $$  | $$  | $$      | $$\\  $$$| $$  | $$");
		System.out.println("           | $$| $$      | $$  | $$ /$$$$$$| $$$$$$$$| $$ \\  $$| $$$$$$$/");
		System.out.println("           |__/|__/      |__/  |__/|______/|________/|__/  \\__/|_______/\n\n");
		
		System.out.println("   _____            _             _          ____                        _");
		System.out.println("  / ____|          | |           | |        / __ \\                      (_)");		
		System.out.println(" | |     ___  _ __ | |_ __ _  ___| |_ ___  | |  | |_ __ __ _  __ _ _ __  _ _______ _ __");
		System.out.println(" | |    / _ \\| '_ \\| __/ _' |/ __| __/ __| | |  | | '__/ _' |/ _' | '_ \\| |_  / _ \\ '__|");
		System.out.println(" | |___| (_) | | | | || |_| | |__| |_\\__ \\ | |__| | | | |_| | |_| | | | | |/ /  __/ |");
		System.out.println("  \\_____\\___/|_| |_|\\__\\__,_|\\___|\\__|___/  \\____/|_|  \\__, |\\__,_|_| |_|_/___\\___|_|");
		System.out.println("                                                        __/ |");
		System.out.println("                                                       |___/\n");
		
		System.out.println("=========================================================================================\n\n");
		
		System.out.println("\t[01] ADD Contacts\n");
		System.out.println("\t[02] UPDATE Contacts\n");
		System.out.println("\t[03] DELETE Contacts\n");
		System.out.println("\t[04] SEARCH Contacts\n");
		System.out.println("\t[05] LIST Contacts\n");
		System.out.println("\t[06] Exit\n");
		
		System.out.print("\nEnter an option to continue -> ");
		int main_option=input.nextInt();
		
		switch (main_option){
			case 1:
				add_contact();
				break;		
			
			case 2:
				update_list();
				break;
				
			case 3:
				del_contact();
				break;				
				
			case 4:
				search_contact();
				break;
			
			case 5:
				list_contact();
				break;
				
			case 6:
				System.exit(0);	
				
			default:
				System.out.println("Invalid Option !");
				System.exit(0);	
		}		
	} 
}
