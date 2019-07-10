package com.jackson;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "user")
public class UserWithRoot {

	public int id;
	    public String name;
	    public UserWithRoot(int i, String string) {
	 	   id=i;
	 	   name=string;
		}
}
