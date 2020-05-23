package com.ta.beans;

public class Thrower {
public int willthrow(int a,int b) {
	if(a<0||b<0) {
		throw new IllegalArgumentException("PLZ input shoud be greather than 0");
	}
	return a+b;
}
}
