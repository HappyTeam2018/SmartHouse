package com.asiainfo.oidengine.common;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 32; i++) {
			System.out.println("create user oid_"+i+" identified by oid_"+i+";\n"+ 
		"grant dba to oid_"+i+" with admin option ;\n"  );
			
		}

	}

}
