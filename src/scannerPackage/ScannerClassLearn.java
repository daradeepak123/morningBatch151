package scannerPackage;

import java.util.Scanner;

public class ScannerClassLearn {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your id");
		int id=sc.nextInt();
		System.out.println("enter your name");
		String name=sc.next();
		System.out.println("enter your department");
		String dept=sc.next();
		
		System.out.println("insert data to DB");
		
		
		
		System.out.println("Hello "+name+" your details are inserted to DB");
		
		
		
		
	}

}
