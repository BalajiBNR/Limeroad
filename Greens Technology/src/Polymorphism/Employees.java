package Polymorphism;

public class Employees{
	
	private void empName(String name1) {
	System.out.println(name1);
}

	private void empName(int a, long b) {
	System.out.println("empid:"+a+b);
}

	private void empName(int d, short c) {
	System.out.println(d+c);
}

	private void empName(int discountprice) {
	System.out.println("percentage:"+discountprice);
}
	public static void main(String[] args) {
	Employees emp=new Employees();
	emp.empName("Arunagiri");
	emp.empName(55,9876l);
	emp.empName(23456,(short)58);
	emp.empName(150);
}

}
