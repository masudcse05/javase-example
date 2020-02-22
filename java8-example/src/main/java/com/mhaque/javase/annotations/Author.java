package com.mhaque.javase.annotations;

import java.lang.annotation.Repeatable;

@Repeatable(Authors.class)
public @interface Author {
	String name(); 
}

