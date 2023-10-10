package Method;

public class Stringmethods {

	public static void main(String[] args) {
		String price="Rs. 1567";
		String firstname="BALAJI";
		String lastname="balaji";
		
		boolean result=firstname.equals(lastname);
		System.out.println(result);
		
		boolean equalsign = firstname.equalsIgnoreCase(lastname);
		System.out.println(equalsign);
		
		char returnchar=firstname.charAt(4);
		System.out.println(returnchar);
		char returnchar1=lastname.charAt(5);
		System.out.println(returnchar1);
		
		boolean startswith=firstname.startsWith("b");
		System.out.println(startswith);
		boolean endswith=lastname.endsWith("I");
		System.out.println(endswith);
		
		int size=firstname.length();
		System.out.println(size);
		int size1=lastname.length();
		System.out.println(size1);
		
		String uppercase=lastname.toUpperCase();
		System.out.println(uppercase);
		String lowercase=firstname.toLowerCase();
		System.out.println(lowercase);
		
		boolean contains=firstname.contains("A");
		System.out.println(contains);
		
		int indexvalue=lastname.indexOf('j');
		System.out.println(indexvalue);
		int indexvalue1=firstname.indexOf('A');
		System.out.println(indexvalue1);
		
		int lastvalue=firstname.lastIndexOf('I');
		System.out.println(lastvalue);
		int lastvalue1=lastname.lastIndexOf('i');
		System.out.println(lastvalue1);
		
		String replacem=price.replaceAll("Rs.","");
		System.out.println(replacem);
		
	}

}
