package com.nt.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;




@Data
@Component
public class DataBaseCon {
	@Value("jdbc.oracle.driver.OracleDriver")
	private String driver;
	@Value("jdbc:oracle:thin:@localhost:1521:xe")
	private String url;

}
