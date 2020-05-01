package com.pco.wortschatz.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EntityScan(basePackages = "com.pco.wortschatz")
@EnableSwagger2
public class BootappApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootappApplication.class, args);
	}
	
//	@Component
//	public class DataLoader implements ApplicationRunner {
//
//		@Autowired
//		private UserService userService;
//
//		public void run(ApplicationArguments args) {
//			ArrayList<User> entities = new ArrayList<>();
//			if (userService.count() < 50) {
//				for (int i = 0; i < 50; i++) {
//					User person = new User("شایان +" + i, "تالش", 28);
//					entities.add(person);
//				}
//				userService.saveAll(entities);
//				userService.flush();
//				System.out.println("Flushing the data is done!");
//			}
//		}
//	}
}
