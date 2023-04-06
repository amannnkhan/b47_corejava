package com.tns.packages;

public class Base {
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate =30;
	protected int varProtected=40;//
	
	void methodDefault() {
		System.out.println("default access base class");
		System.out.println("default varaible"+varDefault);
	}
	 public void methodPublic() {
		System.out.println("default access base class");
		System.out.println("default varaible"+varPublic);
	}

    private void methodPrivate() {
	System.out.println("default access base class");
	System.out.println("default varaible"+varPrivate);
}
    protected void methodProtected() {
    	System.out.println("default access base class");
    	System.out.println("default varaible"+varProtected);
    }
}