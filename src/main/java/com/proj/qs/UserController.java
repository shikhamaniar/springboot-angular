package com.proj.qs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

	@Autowired
	private UserService sev;

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

	@RequestMapping(method=RequestMethod.POST,value="/adduser")
	public void addName(@RequestBody User user)
	{
		sev.adduser(user);
		
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/deleteuser/{id}")
	public String deleteName(@PathVariable int id)
	{
		sev.todeleteuser(id);
		return "delete";
	}
	
	
	
	
	@RequestMapping("/user")
	public  List<User> getsList()
	{
		return sev.getAll();
		
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<User> login(@RequestBody User user ) {
		User user2 = sev.findByEmail(user.getEmail());
		if(user2.getPassword().equals(user.getPassword())) return new ResponseEntity<User>(user2,HttpStatus.OK);
		else return new ResponseEntity<User>(user,HttpStatus.UNAUTHORIZED);
	
    }
	
	

    @RequestMapping(value ="/welcome", method = RequestMethod.GET)
    public String welcome(Model model) {
        return "welcome";
    }
	
	
	
}
