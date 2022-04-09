package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		DataBaseCon db=ac.getBean("dataBaseCon",DataBaseCon.class);
		System.out.println(db);
		System.out.println("------------------");
		Token tk=ac.getBean("token",Token.class);
		System.out.println(tk);
		Token tk1=ac.getBean("token",Token.class);
		System.out.println(tk1);
		System.out.println(tk.hashCode());
		System.out.println(tk1.hashCode());
		ShedulingTest st=ac.getBean("shedulingTest",ShedulingTest.class);
		System.out.println(st.showMsg());
		
	}

}
