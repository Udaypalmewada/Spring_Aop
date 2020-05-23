package com.sm.test;

import com.sm.beans.SecurityHelper;

public class Test {

	public static void main(String[] args) {
     SecurityHelper se=SecurityHelper.gethelper();
     se.login("uday", "uday1");
    boolean chek= se.verified();
    System.out.println(chek);
	}

}
