package Task6;

public class TodayTask1 {
	
	public void logout() {
		System.out.println("User logout the accout and close the page");
	}

	public static void main(String[] args) {
		int i='d'/'d';
		for(int j=i;j<='d';j++) {
		   System.out.println(j);	
		}
		
		TodayTask user=new TodayTask();
		user.login();
		user.search();
		new TodayTask1().logout();
	}

}
