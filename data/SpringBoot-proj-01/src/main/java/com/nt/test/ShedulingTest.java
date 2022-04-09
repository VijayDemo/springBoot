package com.nt.test;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class ShedulingTest {
	@Scheduled(fixedDelay=2000)
	public   String showMsg() {
		System.out.println("HI"+ new Date());
		return null;
		
	}

}
