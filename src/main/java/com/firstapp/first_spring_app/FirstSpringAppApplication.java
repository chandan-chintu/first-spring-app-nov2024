package com.firstapp.first_spring_app;

//import com.firstapp.first_spring_app.model.Address;
//import com.firstapp.first_spring_app.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(FirstSpringAppApplication.class, args);
		System.out.println("Hello everyone this is our first spring boot project");

		// tight coupling example
//		Employee employee1 = new Employee();
//		employee1.id=123;
//		employee1.name="Sanjay";
//		employee1.age=25;
//		employee1.designation="Developer";
//
//		Address address1 = new Address();
//		address1.doorNo=999;
//		address1.streetName="heisj";
//		address1.city="atyuj";
//
//		employee1.address=address1;
//
//		address1.doorNo=345;
//		address1.streetName="ueiw";
//		address1.city="isios";
//
//		employee1.address=address1;
//
//		System.out.println("Employee1 is : "+employee1);
//		System.out.println("Address1 is : "+address1);

		//using setter injection of dependency injection loose coupling

//		Employee employee1 = new Employee();
//		employee1.setId(123);
//		employee1.setName("iowok");
//		employee1.setAge(25);
//		employee1.setDesignation("developer");
//
//		Address address1 = new Address();
//		address1.setDoorNo(333);
//		address1.setStreetName("snxi");
//		address1.setCity("sbuwjns ");
//
//		employee1.setAddress(address1);
//
//		employee1.getAddress().setCity("qqqqqq");
//		employee1.getAddress().setDoorNo(222);
//		employee1.getAddress().setStreetName("lllll");

//		System.out.println("Employee1 is : "+employee1);
//		System.out.println("Address1 is : "+address1);

	}

}
