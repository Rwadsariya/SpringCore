package in.pwskills.nitin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.pwskills.nitin.bean.Employee;

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
	public Employee empObj() {
		System.out.println("Employee object created by AppConfig");
		Employee em = new Employee();
		em.setEid(11);
		em.setEname("sahin");
		em.setEage(34);
		em.setEaddress("MI");
		return em;
	}
}
