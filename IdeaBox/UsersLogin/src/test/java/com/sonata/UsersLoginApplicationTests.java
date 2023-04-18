package com.sonata;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sonata.model.UserLoginModel;
import com.sonata.repository.UserLoginRepository;

@SpringBootTest
class UsersLoginApplicationTests {
	
	@Autowired
	private UserLoginRepository userloginrepository;
	@Test
	//junit test for Post/Save employee method
	public void postUserTest() {
		UserLoginModel user = new UserLoginModel();
//		user.setUserId(22);
//		user.setEmpId(23138);
//		user.setName("Ashutosh");
//		user.setPassword("Ashu@2205");
//		user.setEmailId("pandey.ashu65@gmail.com");
//		user.setDept("os");
//		user.setRole("DET");
//		user.setPhone("8603141435");
		
		userloginrepository.save(user);
		Assertions.assertThat(user.getUserId()).isGreaterThan(0);
	}
	//junit test for getuser using userID
	@Test
    public void getUser() {
		UserLoginModel user=userloginrepository.findById((int) 7L).get();
         Assertions.assertThat(user.getUserId()).isEqualTo(7L);
	}
//	@Test
//  public void getUserId() {
//		UserLoginModel user=userloginrepository.findById((int) 23138L).get();
//       Assertions.assertThat(user.getEmpId()).isEqualTo(23138L);
//    }
	//Delete method using userId
	@Test
    public void deleteUserLoginTest() {
        UserLoginModel user =userloginrepository.findById(4).get();
        userloginrepository.delete(user);

        UserLoginModel userloginmodel1 = null;
        Optional<UserLoginModel> optionalUserLoginModel=userloginrepository.findById(4);

        if(optionalUserLoginModel.isPresent()) {
            userloginmodel1 = optionalUserLoginModel.get();

        }

        Assertions.assertThat(userloginmodel1).isNull();
    }

}
	
