package functionspackage;
import static java.lang.Math.pow;

public class Sine {

	/**
	 * @param args
	 */


	public static double sinet(double x){  


		x = Math.toRadians(x); 
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
