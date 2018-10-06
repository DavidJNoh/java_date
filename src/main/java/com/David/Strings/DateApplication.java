package com.David.Strings;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication

@Controller
public class DateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DateApplication.class, args);
	}
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model x) {
		Date y = new Date();
		System.out.println(y);
		x.addAttribute("date", y);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model x) {
		
		return "time.jsp";
	}
	
}

