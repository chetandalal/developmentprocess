package functionspackage;

public class Xfunc {

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

	public static double calculateIntPower(double  x,double  powerFactor)
	{
	  //base case
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


	public static double exponentfunction(double baseNum,double exponent)
	{
	 double a,b,expIntPart,expfloatPart,answer,baseNum1 = baseNum,exponent1 = exponent;
//	 Scanner scanned = new Scanner(System.in);
//	 System.out.println("ENTER ANY NUMBER : ");
//	 double baseNum = scanned.nextDouble();
//
//	 System.out.println("ENTER THE POWER : ");
//	 double exponent = scanned.nextDouble();
	 expIntPart=(int)exponent1;
	 expfloatPart=exponent1-expIntPart;

	 a=calcutefloatpower(baseNum1,expfloatPart);
	 b=calculateIntPower(baseNum1,expIntPart);

	 answer=a*b;

	return answer;
	 //System.out.println("\ncorrect answer = "+calculateIntPower((float)baseNum,(float)exponent));
	 //return 1;
	 
	}

}