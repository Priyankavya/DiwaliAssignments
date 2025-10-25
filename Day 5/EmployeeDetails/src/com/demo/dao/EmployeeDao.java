package com.demo.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class EmployeeDao {


	static List<Employee> lst;
	static {
		
		lst=new ArrayList<>();
		lst.add(new Employee("sita",1,"ui"));
		lst.add(new Employee("gita",2,"ux"));
	}
	
	public static void ReadData()
	{
		
		try(
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.txt")); 
				
				)
		{
			Object obj=ois.readObject();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
				
		
	}
	
	public boolean save(Employee e) {
		
		lst.add(e);
		return true;
	}
	
	public boolean DeleteEmp(int eid) {
		
		for(Employee e:lst)
		{
			if(e.getEmpID()==eid)
			{
				lst.remove(eid);
			}
		}
		return false;
	}

	public List<Employee> DisplayAll() {
		// TODO Auto-generated method stub
		return lst;
	}

	public List<Employee> SortById() {
		List<Employee> lst2=new ArrayList<Employee>(lst);
		
		lst2.sort((e1,e2)->Integer.compare(e1.getEmpID(), e2.getEmpID()));
		return lst2;
	}

	public List<Employee> ShowByName(String nm) {
		
      List<Employee> lst3=new ArrayList<Employee>();
		
		for(Employee es:lst)
		{
			if(es.getEmpName().equals(nm))
			{
				lst3.add(es);
			}
		}
		return lst3;
	}

	public boolean WriteData() {
		

		try(
				ObjectOutputStream opt= new ObjectOutputStream(new FileOutputStream("data.txt")); 
				
				)
		{
			
			opt.writeObject(lst);
			return true;
			
		}catch (Exception e) {
			System.out.println(" cant write");
		}
				
		return false;
	}
	

}
