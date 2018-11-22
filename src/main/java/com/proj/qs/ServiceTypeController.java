package com.proj.qs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceTypeController {

	@Autowired
	private ServiceTypeService sev;

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

	@RequestMapping(method = RequestMethod.POST, value = "/addservicetype")
	public ResponseEntity<String> addservicetype(@RequestBody ServiceType service) {
		sev.addservicetype(service);System.out.println("Request Get");
	  return new ResponseEntity<String>("Done",HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteservicetype/{id}")
	public String deleteservicetype(@PathVariable int id) {
		sev.deleteservicetype(id);
		return "delete";
	}

	@RequestMapping("/servicetype")
	public List<ServiceType> getsList() {
		return sev.getAllservice();

	}

}
