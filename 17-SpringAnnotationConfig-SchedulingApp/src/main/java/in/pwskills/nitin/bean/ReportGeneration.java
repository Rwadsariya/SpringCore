package in.pwskills.nitin.bean;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ReportGeneration {

	@Scheduled(initialDelay = 2000,fixedDelay = 3000)
	public void generateReport() {
		System.out.println("Sales Report on: "+ new java.util.Date());
	}
}
