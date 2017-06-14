import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.service.CustomerService;

public class Application {

	public static void main(String[] args) {

		// CustomerService customerService = new CustomerServiceImpl();

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		CustomerService service = applicationContext.getBean("customerService", CustomerService.class);
		System.out.println(service);
		CustomerService service2 = applicationContext.getBean("customerService", CustomerService.class);
		System.out.println(service2);
		
		System.out.println(service.findAll().get(0).getFirstName());

	}

}
