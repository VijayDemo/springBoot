package com.nt.test;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.ToString;
@ToString
@Component
@Scope("prototype")
public class Token {
	private String token;
	public Token() {
token=String.valueOf(new Random().nextInt(999));

	}

}
