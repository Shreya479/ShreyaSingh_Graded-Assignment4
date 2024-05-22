package com.employee.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncryptor {
	public static void main(String[] args)
	{
		BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
	 String plaintext="Welcome";
	 String encodedPassword=passwordEncoder.encode(plaintext);
	 System.out.println(passwordEncoder.matches(plaintext, encodedPassword));
	
	}

}
