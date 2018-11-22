package com.proj.qs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

	@Autowired
	private ServiceService sev;

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

	@RequestMapping(method = RequestMethod.POST, value = "/addservice")
	public void addName(@RequestBody Services service) {
		sev.addservice(service);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteservice/{id}")
	public String deleteName(@PathVariable int id) {
		sev.deleteservice(id);
		return "delete";
	}

	@RequestMapping("/service")
	public List<Services> getsallservice() {
		return sev.getallservice();
	}

}
