package Task2;

public class Operators {
	void Arithmetic() {
		System.out.println("Output Arithmetic operastors");
		System.out.println(2+7);
		System.out.println(2-7);
		System.out.println(2*7);
		System.out.println(2/7);
		System.out.println(2%7);
	}
    void assignment() {
	   int r = 2;
	   r += 7;
	   int s = 2;
	   s -= 7;
	   int d = 2;
	   d *= 7;
	   int b = 2;
	   b /= 7;
	   int c = 2;
	   c %= 7;
	   System.out.println("Output Assignment operators");
	   System.out.println(r);
	   System.out.println(s);   
	   System.out.println(d);
	   System.out.println(b);
	   System.out.println(c);
   }
    void comparission() {
    	int num1=2; 
    	int num2=7;
    	System.out.println("Output Comparission operators");
    	System.out.println(num1>num2);
    	System.out.println(num1<num2);
    	System.out.println(num1<=num2);
    	System.out.println(num1>=num2);
    	System.out.println(num1!=num2);
    	System.out.println(num1==num2);
    	
    }
    public static void main(String[] args) {
		Operators oper = new Operators();
		oper.Arithmetic();
		oper.assignment();
		oper.comparission();
	}

}
