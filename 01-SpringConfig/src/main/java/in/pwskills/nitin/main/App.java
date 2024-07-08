package in.pwskills.nitin.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.nitin.bean.Employee;
import in.pwskills.nitin.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);    
        Employee employee = context.getBean("emp", Employee.class);
        
        System.out.println(employee);

        ((AbstractApplicationContext)context).close();
    }
}
