package com.jackson;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MainClass {
  public static void main(String args[]) {
	UserWithRoot ur=new UserWithRoot(1,"hi");
	ObjectMapper obj = new ObjectMapper();
	try {
		String jsonObj = obj.writeValueAsString(ur);
		System.out.println(jsonObj);
	}
	catch (IOException e) {
		e.printStackTrace();
}
}
}