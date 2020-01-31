package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {

	public List<Department> findAll() {
		
		List<Department> list = new ArrayList<>();
		list.add(new Department(1, "dp1"));
		list.add(new Department(2, "dp2"));
		list.add(new Department(3, "dp3"));
		
		return list;
	}
}
