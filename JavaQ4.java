package JavaProgramEx;

import java.util.Scanner;

public class JavaQ4 {

	private  int empId;
	private String empName; 
	private String empDesignation;
	private double basicSalary; 
	
	public void read()
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Emp Id: ");
		this.empId = sc1.nextInt();
		System.out.println("Enter Emp Name :");
		this.empName = sc1.nextLine();
		System.out.println();
		System.out.println("Enter EmpDesignation :");
		this.empDesignation = sc1.nextLine();
		System.out.println("Enter besicSalary :");
		this.basicSalary = sc1.nextDouble();
	}
	
	 public void write()
	 {
		 System.out.println("Emp Id" +empId);
		 System.out.println("Emp Name"+empName);
		 System.out.println("Emp Designation"+ empDesignation);
		 System.out.println("Emp besicSalary" + basicSalary);
 }

	 public static void main(String[] args) {
		
		 JavaQ4[] ob = new JavaQ4[2];
		for(int i=0;i<ob.length; i++)
		{
		     System.out.println("\n Enter details of Employee " + (i + 1) + ":");
		     ob[i] = new JavaQ4();
		     ob[i].read();
		}
		
		 System.out.println("\nEmployee Information:");
		for(int i=0;i<ob.length; i++)
		{
			 System.out.println("\n Details of Employee " + (i + 1) + ":");   
			 ob[i].write();
		}
		
		 
		 
	}

}
