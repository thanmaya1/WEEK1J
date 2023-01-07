public class Electricity {
public static void main(String [] args) {
	int unit= 300;
	int flag;
	int extra=0;
	
	if(unit<50)
		flag=2;
	else if(unit<=100)
		flag=3;
	else if(unit<=300) {
		flag=5;
	    extra=100;
	}
	else if(unit<=450) {
		flag=6;
	    extra=200;
	}
		
	else  {
		flag=8;
	    extra=250;
	}
		
	
	int total=unit*flag+extra;
	System.out.println(total);
	
	
	/*generate electricity bill based on the units
<50 2RS PER UNIT 
FROM 51 TO 100 3RS PER UNIT
FROM 101 TO 300 5RS PER UNIT AND ADD 100 Rs extra to the total bill
FROM 301 TO 450 6RS PER UNIT  AND ADD 200 Rs extra to the total bill
>450 8RS PER UNIT FROM 301 TO 450 6RS PER UNIT  AND ADD 200 Rs extra to the total bill
Calculate the bill, take inputs in java
*/
	
	
	
}
}
