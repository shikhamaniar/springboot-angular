package com.proj.qs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StaffController {


	@Autowired
	private StaffService sev;

//	@RequestMapping("/name")
//	public String sayIt() {
//        User user1= new User("Alice", "Ddfsdf", "@#424", 1,324);
//        User user2= new User("Bob", "Dderwfsdf", "2131", 0,3243325);
//        User user3= new User("Cxx", "Ddfsdweref", "34534", 1,4324);
//		sev.tosave(user2);
//		sev.tosave(user3);
//		sev.tosave(user1);
//		return "done";
//	}
//	

	@RequestMapping(method=RequestMethod.POST,value="/addstaff")
	public void addName(@RequestBody Staff staff)
	{
		sev.addstaff(staff);
		
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/deletestaff/{id}")
	public String deleteName(@PathVariable int id)
	{
		sev.deletestaff(id);
		return "delete";
	}
	
	
	@RequestMapping(method=RequestMethod.PUT,value="/updatestaff")
	public void updateName(@RequestBody Staff name)
	{
		sev.updateName(name);
		
		
	}
	
	
	@RequestMapping("/staff")
	public  List<Staff> getsList()
	{
		return sev.getallstaff();
	}
	
	
	
	

}
