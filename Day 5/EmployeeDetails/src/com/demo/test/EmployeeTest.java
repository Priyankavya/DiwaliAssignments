package com.demo.test;

import java.util.List;
import java.util.Scanner;
import com.demo.beans.*;
import com.demo.service.EmployeeService;

public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeService eservice=new EmployeeService();
		Scanner sc=new Scanner(System.in);
		
		int c=0;
		
		
		do {
			
			
			System.out.println("1.Add Employee to list");
			System.out.println("2.Remove Employee from list");
			System.out.println("3.show all employee");
			System.out.println("4.show all employee in sorted order");
			System.out.println("5.find employee by name");
			System.out.println("6.save all employee to file");
			System.out.println("7.quit");
			
			System.out.println(" enter choice");
			c=sc.nextInt();
			
			switch(c)
			{
			case 1->{
				boolean status=eservice.AddEmployee();
				
				if(status)
				{
					System.out.println(" employee added successfully..");
				}
				
				else
				{
					System.out.println(" employee not added..");
				}
			}
			
			case 2->
			{
				System.out.println(" enter employee id");
				int eid=sc.nextInt();
				
                boolean status2=eservice.RemoveEmployee(eid);
				
				if(status2)
				{
					System.out.println(" employee removed successfully..");
				}
				
				else
				{
					System.out.println(" employee not removed..");
				}
			}
			
			case 3->{
				List<Employee> elst=eservice.ShowAll();
				
				if(elst!=null)
				{
					System.out.println(elst);
				}
				else
				{
					System.out.println(" file is empty");
				}
				
			}
			
			case 4->
			{
				
				List<Employee> elst2=eservice.SortData();
				if(elst2!=null)
				{
					System.out.println(elst2);
				}
				
				else
				{
					System.out.println(" not sorted ..");
				}
						
			}
			
			case 5->{
				System.out.println(" enter employee name");
				String nm=sc.next();
				
				List<Employee> elst3=eservice.DisplayByName(nm);
				if(elst3!=null)
				{
					System.out.println(elst3);
				}
				
				else
				{
					System.out.println(" not  found ..");
				}
				
			}
			
			case 6->
			{
				boolean status6=eservice.WriteonFile();
				if(status6)
				{
					System.out.println("written successfully");
					
				}
				else
				{
					System.out.println("error");
				}
				
			}
			
			
			case 7->{
				System.out.println("exit");
			}
			
			
			
			}
			
			
		}while(c!=7);
		
		

	}

}
