package com.lib.tns;

public class Customer {
	private String customername;
    private int customerid;
    private String customercity;
    
    public Customer(){
     System.out.println("Default cons");
    	
    }
    
	public Customer(String customername, int customerid, String customercity) {
		super();
		this.customername = customername;
		this.customerid = customerid;
		this.customercity = customercity;
		System.out.println("parameterized");
		System.out.println("name"+" "+customername +"id"+" "+customerid+"city"+""+customercity);
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		customername = customername;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		customerid = customerid;
	}

	public String getCustomercity() {
		return customercity;
	}

	public void setCustomercity(String customercity) {
		customercity = customercity;
	}
    
}
