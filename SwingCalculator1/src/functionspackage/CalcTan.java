package functionspackage;

//import java.util.Scanner;
public class CalcTan {


    
    public static double CalcTanFun(double input){
    	
        double num,num1;
        double sin1, cos1,cos_po1, interim1, sin_po1,interim2,val1;
        double fact_cos, fact_sin, cos_po2, sin_po2,tan;
        int ch;
        
        sin1=0;
        cos1=0;
        
        
         num1=input;    
         num1=(double) num1*(Math.PI/180);
             for(int i=0; i<6; i++){
         fact_cos= factorial(2*i);
         fact_sin=factorial((2*i)+1);
         cos_po1= powerfun(num1,(2*i));
         cos_po2= powerfun(-1,i);
         sin_po1= powerfun(num1,((2*i)+1));
         sin_po2= powerfun(-1, i);
         interim1=(cos_po2/fact_cos)*cos_po1;
         interim2=(sin_po2/fact_sin)*sin_po1;
         cos1+=interim1;
         sin1+=interim2;
        }
        
         tan=sin1/cos1;
        //System.out.println("Tan Answer(approximate to 3 decimal points): "+tan);
		return tan;
    }
    
    static double powerfun (double x, int y)
    {
     double val;
     val=1;
     for (int i=0; i<y; i++)
     {
    
     val*=x;
    
     }
     return val;
    }

    static double factorial ( double input )
    {
      double x, fact = 1;
      for ( x = input; x > 1; x--)
         fact *= x;

      return fact;

    }
}