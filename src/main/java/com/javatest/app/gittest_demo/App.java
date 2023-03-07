package com.javatest.app.gittest_demo;

/**
 * Hello world!
 *
 */
public class App 
{
	public void addData(String data) {
		System.out.println("data = " +data);
		if(data.equals("Java Test")) {
			System.out.println("Test if condition");
		}
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
