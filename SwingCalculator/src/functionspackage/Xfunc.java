/**
 * Calculate X to the power X trancendental function
 * 
 * This code is a part of a project for the course SOEN 6011 "Software Engineering Development Processes"
 * taught by Dr. Pankaj Kamthan.
 * 
 * @author Chetan Dalal
 * @copyright	August 2014 - Concordia University, Montreal, QC
 * 
 */
package functionspackage;

public class Xfunc {

	//Calculates the precision values for power separately using the roundoff
public static double calcutefloatpower(double  numBase,double powerFloat)
	{
		double i;
		double answer;
		double z=0.0000001;
		double powerfactor=1;
		for(i=0;i<numBase;i=(i+z))
		{
			if((calculateIntPower(i,calculateIntPower(10,powerfactor))) > numBase)
			{
				i=(i-z);
				break;
			}
		}
		powerFloat= (powerFloat*calculateIntPower(10,powerfactor));
		powerFloat= roundoff(powerFloat);
		answer=calculateIntPower(i,powerFloat);
		return answer;
	}

public static double roundoff(double num)
	{
		double limit;
		limit=(int)num+0.5;
		if(num>limit)
			return ((int)num + 1 );
		else
			return ((int)num);
	}

	//Calculate Negative and positive integer powers: includes decimals
public static double calculateIntPower(double  x,double  powerFactor)
	{
		if(powerFactor==0){
			return 1;
		}else if(powerFactor>0){   //recursive condition for postive power
			return x*calculateIntPower(x, powerFactor-1);
		}else if(powerFactor<0){  //recursive condition for negative power
			return (1/x)*calculateIntPower(x, powerFactor+1);
		}else{ 
			return -1;
		}
	}

	/**
	 * get value 
	 * @param base value 
	 * @param exponent the power value
	 */
public static double exponentfunction(double baseNum,double exponent)
	{
		double a,b,expIntPart,expfloatPart,answer,baseNum1 = baseNum,exponent1 = exponent;
		/** Debugging 
		 * Scanner scanned = new Scanner(System.in);
		 * System.out.println("ENTER ANY NUMBER : ");
		 * double baseNum = scanned.nextDouble();
		 * System.out.println("ENTER THE POWER : ");
		 * double exponent = scanned.nextDouble();
		 */
		expIntPart=(int)exponent1;
		expfloatPart=exponent1-expIntPart;

		a=calcutefloatpower(baseNum1,expfloatPart);
		b=calculateIntPower(baseNum1,expIntPart);

		answer=a*b;

		return answer;
	}	
}

