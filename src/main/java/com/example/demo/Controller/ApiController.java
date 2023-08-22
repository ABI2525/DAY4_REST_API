package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {
	@Autowired
	ApiService sser;
	
	@PostMapping("addnew")
	public List<Student> add(@RequestBody List<Student> ss)
	{
		return sser.saveinfo(ss);
	}
	
	@GetMapping("showdetail")
	public List<Student> show()
	{
		return sser.showinfo();
	}
	
	@PutMapping("update")
	public Student up(@RequestBody Student ss)
	{
		return sser.changeinfo(ss);
	}
	
	@DeleteMapping("del")
	public String delete (Student ss)
	{
		sser.deleteinfo(ss);
		return "Deleted SuccessFully";
	}
	
	
}
