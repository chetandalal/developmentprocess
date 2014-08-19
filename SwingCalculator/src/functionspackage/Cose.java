
package functionspackage;

public class Cose {

	public static double cosF(double input)
	{     
		//input = Math.toRadians(input); 

		double sum = 0 ;

		for(int i = 0 ; i < 3 ; i++)   
		{
			sum=sum+(((powerFun((-1), i)*(powerFun(input, (2*i))))/factorialFun(2*i)));
		}

		return sum;


	}   


	public static int factorialFun(int a){
		int factorialAns=1;
		for (int i=1; i<=a; i++){
			factorialAns=factorialAns*i;
		}

		return factorialAns;
	}

	public static double powerFun(double a, int b){
		double y=a;
		if(b==0){
			a=1;
		}
		else{
			for(int i=1; i<b;i++){
				a=a*y;
			}
		}

		return a;
	}



}



