package com.unittest.testing;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner input = new Scanner(System.in);
    	 	
    	System.out.print( "Input Celcius: " );
    	double celcius = input.nextDouble();
    	
    	Fahrenheit f = new Fahrenheit();
    	
    	while(!f.isBound(celcius)) {
    		System.out.println( "Input Again!!!" );
    		System.out.print( "Input Celcius: " );
    		celcius = input.nextDouble();
    		}
    	
    	f.input(celcius);
    	System.out.print(f.toString());
    }
}
