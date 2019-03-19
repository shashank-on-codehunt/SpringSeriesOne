package com.example.Series1;

import com.example.Series1.Controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Series1Application {
	static ApplicationContext applicationContext;
	public static void main(String[] args) {
		applicationContext = SpringApplication.run(Series1Application.class, args);
		new Series1Application().contextExperimentation();
	}

	private void contextExperimentation() {
		//Make sure that the name of the bean is accordingly the first character should be interchanged with captial or small accordingly
		MyController myController =  (MyController)applicationContext.getBean("myController");
		System.out.println(myController.showResult());
	}
}
