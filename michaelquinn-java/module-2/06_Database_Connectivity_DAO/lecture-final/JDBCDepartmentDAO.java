package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.DepartmentDAO;

public class JDBCDepartmentDAO implements DepartmentDAO {
	
	private JdbcTemplate jdbcTemplate;

	public JDBCDepartmentDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Department> getAllDepartments() {
		List<Department> deptList = new ArrayList<>();
		
		String query = "SELECT department_id, name FROM department";
		
		SqlRowSet rowSet = jdbcTemplate.queryForRowSet(query);
		
		while(rowSet.next()) {
			Department newDept = getDepartmentFromRowSet(rowSet);
			deptList.add(newDept);
		}
		
		
		return deptList;
	}

	@Override
	public List<Department> searchDepartmentsByName(String nameSearch) {
		List<Department> deptList = new ArrayList<>();
		
		String query = "SELECT department_id, name FROM department WHERE name=?";
		
		SqlRowSet rowSet = jdbcTemplate.queryForRowSet(query, nameSearch);
		
		while(rowSet.next()) {
			Department dept = getDepartmentFromRowSet(rowSet);
			deptList.add(dept);
		}
		
		return deptList;
	}

	@Override
	public void saveDepartment(Department updatedDepartment) {
		
	}

	@Override
	public Department createDepartment(Department newDepartment) {
		String query = "INSERT INTO department (name) VALUES (?)";
		
		// Insert the department
		jdbcTemplate.update(query, newDepartment.getName());
		
		// query the db for inserted record id
		// and update the department id
		newDepartment.setId(getDepartmentId(newDepartment.getName()));
		
		// return the updated department
		return newDepartment;
	}

	@Override
	public Department getDepartmentById(Long id) {
		return null;
	}
	
	private Department getDepartmentFromRowSet(SqlRowSet rowSet) {
		Department dept = new Department();
		dept.setId(rowSet.getLong("department_id"));
		dept.setName(rowSet.getString("name"));
		
		return dept;
		
	}
	
	private Long getDepartmentId(String name) {
		// query the department id by name
		String query = "SELECT department_id FROM department WHERE name=?";
		
		// id should be unique so we can use queryForObject
		Long resultId = jdbcTemplate.queryForObject(query, Long.class, name);
		
		// return id
		return resultId;
	}

}
