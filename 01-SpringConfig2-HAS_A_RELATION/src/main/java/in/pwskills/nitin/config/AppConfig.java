package in.pwskills.nitin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	static {
		
		System.out.println("AppConfig .class loaded");
	}
	
	public AppConfig() {
		// TODO Auto-generated constructor stub
		System.out.println("AppConfig object got created..");
	}
	
	@Bean(name = "emp")
	public Object empObj() {
		System.out.println("Employee object created by AppConfig");
		return null;
	}
}
