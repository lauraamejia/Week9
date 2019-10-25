package dmacc;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.controller.BeanConfiguration;
import dmacc.model.User;
import dmacc.model.UserItem;
import dmacc.repository.UserRepository;

@SpringBootApplication
public class UserSpringBootApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(UserSpringBootApplication.class, args);
	}
	
	@Autowired
	UserRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
				UserItem u = appContext.getBean("useritem", UserItem.class);
				User user = appContext.getBean("user", User.class);
				
			
				u.setUser(user);
				
			
				repo.save(u);
				
				
				List<UserItem> allMyContacts = repo.findAll();
				for(UserItem people: allMyContacts) {
					System.out.println(people.toString());	
		}
	}
}
