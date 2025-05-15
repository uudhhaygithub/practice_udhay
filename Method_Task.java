//methods
package org.Methods;

public class Method_Task {
	
	
	
	//greeting method
public void Greeting() {					
System.out.println("hai mam welcome");
}


//the sum of two numbers
public void add(int a,int b) {						
	System.out.println(a+b);
}	


//find the maximum of two numbers
public void greater(int a,int b) {							
		
		int c = (a<b)?a:b;
		System.out.println("greater number is :"+c);
}		


//check if a number is a palindrome
public void palindrome() {							
int a=121;

	System.out.println();
}	


//calculate the factorial of a number
public void factorial(int a) {

		long f = 1;
		for(int i=1;i<=a;i++) {
			f*=i;
			
			}
		System.out.println("factorial of the number :"+f);

}	


//calculate the area of a circle.
public void circle(int r) {							 
		
		double d =3.14*r*r;
		System.out.println("Area of circle"+d);
}


//oddoreven.
public void oddoreven(int e) {							 
		
		String d =(e%2==0)?" even":" odd";
		System.out.println("Number :"+e+d);
		}

//check if a number is prime. 
					
	public boolean Prime(int n) {
	    if (n <= 1) {
	        return false;
	    }

	    for (int i = 2; i <= Math.sqrt(n); i++) {
	        if (n % i == 0) {
	            return false;
	        }
	    }

	    return true;
	}
public void prime2( int n) {
	 
     int count = 0;

     for (int i = 1; i <= n; i++) {
         if (n % i == 0) {
             count++;
         }
     }

     String result = (count == 2) ? "Prime Number" : "Not a Prime Number";
     System.out.println(n + " is " + result);
}


//swap 2 numbers
public void swap(int a,int b) {
	 

     System.out.println("Before Swap: a = " + a + ", b = " + b);

     int temp = a;
     a = b;
     b = temp;

     System.out.println("After Swap: a = " + a + ", b = " + b);
}


	
	
	public static void main(String[] args) {
		Method_Task obj=new Method_Task();
		obj.Greeting();
		obj.add(3, 5);
		obj.greater(4,8);
		obj.factorial(10);
		obj.circle(3);
		obj.oddoreven(5);
		System.out.println(obj.Prime(7));
		obj.prime2(8);
		obj.swap(20, 30);
		
	}

}
