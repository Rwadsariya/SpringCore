<<<<<<< HEAD
package in.pwskills.nitin.bean;

import org.springframework.stereotype.Component;

public class Bank {
	
	public double calculateCompoundInterest(double pamt, double rate,double time) {
		System.out.println("Bank.calculateCompoundInterest()");
		
		return (pamt * Math.pow(1+rate/100, time))-pamt;
	}

}
=======
package in.pwskills.nitin.bean;

import org.springframework.stereotype.Component;

public class Bank {
	
	public double calculateCompoundInterest(double pamt, double rate,double time) {
		System.out.println("Bank.calculateCompoundInterest()");
		
		return (pamt * Math.pow(1+rate/100, time))-pamt;
	}

}
>>>>>>> 0b2ee0fce849248a48ae05a720d05142868b0c0a
