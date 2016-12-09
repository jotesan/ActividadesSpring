package org.cuatrovientos.spring.hotelspring;

import org.cuatrovientos.spring.hotelspring.models.Hotel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Hotel hotel = (Hotel) context.getBean("hotel");
		System.out.println(hotel.toString());


	}

}
