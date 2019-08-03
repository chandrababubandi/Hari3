package in.scb.springfy.SearchAppWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SearchAppWebApplication {

	public static void main(String[] args) {
		System.out.println("Before Web app");
		ApplicationContext applicationContext=SpringApplication.run(SearchAppWebApplication.class, args);
		System.out.println("After Web app");
	}

}
