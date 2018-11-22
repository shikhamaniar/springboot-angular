package com.proj.qs;

import static org.junit.Assert.*;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRTest {

	@Autowired
    private UserRepository userRepository;
    @Before(value = "")
    public void setUp() throws Exception {
        User user1= new User("Alice", "Ddfsdf", "@#424", 1,324);
      //  User user2= new User("Bob", 38);
        //save user, verify has ID value after save
        assertNull(user1.getAid());
        //assertNull(user2.getId());//null before save
        this.userRepository.save(user1);
       // this.userRepository.save(user2);
        assertNotNull(user1.getAid());
       // assertNotNull(user2.getId());
    }

    @Test
    public void test(){
        /*Test data retrieval*/
        User userA = userRepository.findByName("Alice");
     //  assertNotNull(userA);
       assertEquals("Ddfsdf", userA.getEmail());
        /*Get all products, list should only have two*/
        Iterable<User> users = userRepository.findAll();
        int count = 0;
        for(User p : users){
            count++;
        }
        assertEquals(count, 6);
    }
	
}
