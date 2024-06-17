package learnEmployee;


public class Employee {
	
	int id;
	String empName;
	String department;
	int sal;
	int age;
	String gender;
	String address;
	String phNo;
	int attend;
	static String companyname="Quality Thought";    //8bytes
	
	
	public void AssignValues(int eid,String eempName,String eDepartment,int esal,int eage, String egender, String eaddress, String ephNo,int eatt)
	{
		id=eid;
		empName=eempName;
		department=eDepartment;
		sal=esal;
		age=eage;
		gender=egender;
		address=eaddress;
		phNo=ephNo;
		attend=eatt;
		System.out.println("**********************************");
		
	}
	
	public void displayDetails(int eid,String eempName,String eDepartment,int esal,int eage, String egender, String eaddress, String ephNo,int eatt)
	{
		System.out.println(id=eid);
		System.out.println(empName=eempName);
		System.out.println(department=eDepartment);
		System.out.println(sal=esal);
		System.out.println(age=eage);
		System.out.println(gender=egender);
		System.out.println(address=eaddress);
		System.out.println(phNo=ephNo);
		System.out.println(attend=eatt);
		System.out.println(companyname);
		System.out.println("**********************************");
		
	}
	
	public void displayDetails1()
	{
		System.out.println(id);
		System.out.println(empName);
		System.out.println(department);
		System.out.println(sal);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(address);
		System.out.println(phNo);
		System.out.println(attend);
		System.out.println(companyname);
		System.out.println("**********************************");
		
	}
	
	public void empAtt()
	{
		
		System.out.println(empName+" attendence is "+ attend+"%");
		
	}
	

	public static void main(String args[])
	{
		
		Employee o1=new Employee();

		o1.AssignValues(101,"Ram","Testing",100000,21,"male","Hyderabad","9999999999",100);
		o1.displayDetails1();
		o1.empAtt();
		
		
		Employee o2=new Employee();
//		o2.id=102;
//		o2.empName="Krish";
//		o2.department="testing";
//		o2.sal=200000;
//		o2.age=20;
//		o2.gender="male";
//		o2.address="hyderabad";
//		o2.phNo="9999999998";
//		o2.attend=95;
		o2.displayDetails(102,"Krish","Testing",150000,20,"male","Hyderabad","9999999998",95);
		
//		System.out.println(o2.id);
//		System.out.println(o2.empName);
//		System.out.println(o2.department);
//		System.out.println(o2.sal);
//		System.out.println(o2.age);
//		System.out.println(o2.gender);
//		System.out.println(o2.address);
//		System.out.println(companyname);
//		System.out.println("**********************************");
		
		o2.empAtt();
		
		
	}
	
}
