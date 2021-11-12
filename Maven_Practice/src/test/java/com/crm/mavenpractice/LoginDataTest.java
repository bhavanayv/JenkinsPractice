package com.crm.mavenpractice;

import org.testng.annotations.Test;

public class LoginDataTest {
	@Test
	public void testData()
	{
		String url=System.getProperty("url");
		System.out.println(url);
		String username=System.getProperty("un");
		System.out.println(username);
		String password=System.getProperty("pwd");
		System.out.println(password);
	}
}
