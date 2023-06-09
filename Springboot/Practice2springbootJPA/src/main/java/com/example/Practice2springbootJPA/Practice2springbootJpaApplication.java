package com.example.Practice2springbootJPA;

import com.example.Practice2springbootJPA.Modal.User;
import com.example.Practice2springbootJPA.Repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Practice2springbootJpaApplication {

	public static void main(String[] args) {


	ApplicationContext context = SpringApplication.run(Practice2springbootJpaApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

//		User user = new User();
//		user.setName("Anmol");
//		user.setCity("JBP");
//		user.setStatus("Programmer");
//		User user1 = userRepository.save(user);
//
//		System.out.println(user1);

		///*******************create object of user
//		 user1 = new User();
//		user1.setName("Swati");
//		user1.setCity("Delhi");
//		user1.setStatus("Python Programmer");
//
//		User user2 = new User();
//		user2.setName("Muskan");
//		user2.setCity("Bhopal");
//		user2.setStatus("java Programmer");
//
//		User resultuser1 = userRepository.save(user1);
//		User resultuser2 = userRepository.save(user2);
//
//		System.out.println(resultuser1 +"\n"+resultuser2);

		//****************update the user
//		Optional<User> optional = userRepository.findById(1); // use to get data by id
//		  User user = optional.get();  //
//
//		  user.setName("Animo");
//
//		 user =  userRepository.save(user);

//		System.out.println(user);

//		Iterable<User> itr = userRepository.findAll();
//		Iterator<User> iterator = itr.iterator();
//		while(iterator.hasNext()){
//			System.out.println(iterator.next());
//		}

//		itr.forEach(user1 -> System.out.println(user1));


		//***************deleting the user***********************

//		userRepository.deleteById(2); // delete the object

		//delete all data
//		Iterable<User> allUser = userRepository.findAll();
//		userRepository.deleteAll(allUser);

		//******************Custom Methods*********************
//		List<User> getuser = userRepository.findByName("Muskan");
//		System.out.println(getuser);
//
//		List<User> list = userRepository.findByCity("Delhi");
//		System.out.println(list);

		User user3 = userRepository.findByNameAndCity("dev","Delhi");
		System.out.println(user3);




	}

}
