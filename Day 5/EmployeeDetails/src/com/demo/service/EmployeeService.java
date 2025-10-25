package com.demo.service;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
public class EmployeeService {

	EmployeeDao edao=new EmployeeDao();

	Scanner s=new Scanner(System.in);
	public boolean AddEmployee() {
		
		System.out.println(" enter employee name");
		String ename=s.next();
		
		System.out.println(" enter employee id");
		int eid=s.nextInt();
		
		System.out.println(" enter employee role ");
		String erole=s.next();
		
		Employee e=new Employee(ename, eid, erole);
		return edao.save(e);
		
	
	}
	public boolean RemoveEmployee(int eid) {
		// TODO Auto-generated method stub
		return edao.DeleteEmp(eid);
	}
	public List<Employee> ShowAll() {
		// TODO Auto-generated method stub
		return edao.DisplayAll();
	}
	public List<Employee> SortData() {
		// TODO Auto-generated method stub
		return edao.SortById();
	}
	public List<Employee> DisplayByName(String nm) {
		// TODO Auto-generated method stub
		return edao.ShowByName(nm);
	}
	public boolean WriteonFile() {
		// TODO Auto-generated method stub
		return edao.WriteData();
	}
}
