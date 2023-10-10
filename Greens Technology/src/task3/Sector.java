package task3;

public class Sector {
	
	static void elseifTest() {
	int age=25;
	if ((age<18)&&(age>=1)) {
		System.out.println("minor");
	}
	else if((age>=18)&&(age<=100)) {
		System.out.println("manjor");
	}else {
		System.out.println("invalid age");
	}
	}
	
	public static void nested() {
		int age = 65;
		if ((age>=1)&&(age<=100)) {
			if ((age>=1)&&(age<18)) {
				if ((age>=1)&&(age<=5)) {
					System.out.println("child");
				}else if ((age>5)&&(age<18)) {
					System.out.println("minor");
				}
			}else {
				if ((age>=18)&&(age<60)) {
					System.out.println("major");
				}else {
					System.out.println("Senior citizen");
				}
			}
		}else {
			System.out.println("Invalid age");
		}
	}
	
	public static void switchTest() {
		int error_code = 404;
		switch (error_code) {
		case 400:
			System.out.println("Bad request");
			break;
		case 401:
			System.out.println("unauthorized");
			break;
		case 403:
			System.out.println("forbidden");
			break;
		case 404:
			System.out.println("not found");
			break;
		case 500:
			System.out.println("internal server error");
			break;
			default:
				System.out.println("invalid code");
		}
	}

	public static void code() {
		String code = "Internal error";
		switch (code) {
		case "bad request":
			System.out.println("400");
			break;
		case "not found":
			System.out.println("401");
			break;
		case "Internal error":
			System.out.println("403");
			break;
		case "Forbidden":
			System.out.println("404");
			break;
		case "unauthorised":
			System.out.println("500");
			break;
			default:
				System.out.println("invalid code");
		}
	}
	public static void main(String[] args) {
	elseifTest();
	nested();
	switchTest();
	code();
	}

}
