/**
 * Calculate Sine function for 
 * 
 * This code is a part of a project for the course SOEN 6011 "Software Engineering Development Processes"
 * taught by Dr. Pankaj Kamthan.
 * 
 * @author Navpreet Singh
 * @copyright	August 2014 - Concordia University, Montreal, QC
 * 
 */
package functionspackage;
import static java.lang.Math.pow;

@SuppressWarnings("unused")
public class Sine {

	/**
	 * @param args
	 */


	public static double sinet(double x){  


		//x = Math.toRadians(x); //please remove this, only use Universal constants from math lib like PIE.
		double sumTaylor = 0 ;

		for(int i = 0 ; i < 3 ; i++)   
		{

			sumTaylor=sumTaylor+(((powerFx((-1), i)*(powerFx(x, (2*i+1))))/factorial(2*i+1)));
		}
		//System.out.println("Value Input: "+x);
		//System.out.println("Sine: "+sumTaylor);
		return sumTaylor;


	}   

	public static double powerFx(double x, int b){
		double y=x;
		if(b==0){
			x=1;
		}
		else{
			for(int i=1; i<b;i++){
				x=x*y;
			}
		}
		//System.out.println(x);
		return x;
	}

	public static int factorial(int a){
		int factOut=1;
		for (int i=1; i<=a; i++){
			factOut=factOut*i;
		}
		//System.out.println("Factorial: "+factOut);
		return factOut;
	}



}
