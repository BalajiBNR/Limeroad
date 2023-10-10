package Array;

public class Find {

	public static void main(String[] args) {
		String[] value= {"Jan","Dec","July","June","Sep","Aug"};
		for(int i=2;i<value.length-2;i++) {
		System.out.println(value[i]);
		}
		System.out.println();
		int[] find= {10,2,8,4};
		for(int j=2;j>=0;j--) {
			System.out.println(find[j]);
		}
		System.out.println();
		String[]print= {"Renu","Nayanika","Arun","Ragini","Rajagopal"};
		for(int s=3;s<print.length;s++) {
			System.out.println(print[s]);
		}
	}
}
