package com.javatest.app.gittest_demo;


public class App 
{
	public void addData(String data) {
		
		if(data.equals(Constant.DATA_TYPE)) {
			System.out.println("Test if condition");
		}
	}
	public void addMethod() {
	System.out.println("new method added");
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
