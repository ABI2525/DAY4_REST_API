package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repositories.StudentRepo;

@Service
public class ApiService {
	@Autowired
	StudentRepo sr; 
	
	public List<Student>  saveinfo(List<Student> ss)
	{
		return(List<Student>)sr.saveAll(ss);
	}
 
	public List<Student> showinfo()
	{
		return sr.findAll();
	}
	 
	public Student changeinfo(Student ss)
	{
		return sr.saveAndFlush(ss);
	}
	
	public String deleteinfo(Student ss)
	{
		sr.delete(ss);
		return "Deleted Successfully ";
	}
}
