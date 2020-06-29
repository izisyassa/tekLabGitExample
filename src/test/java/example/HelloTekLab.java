package example;

import org.testng.annotations.BeforeMethod;

public class HelloTekLab {

	public static void main(String[] args) {

		System.out.println("Hello TekLab Students");
		System.out.println(" Let's change the world");
		
		System.out.println("--------Change this line and and ****");
		System.out.println("Showing how to commit ");
		System.out.println("clean up code");
		System.out.println(" another code I write");
		
		
		System.out.println("Priscilla 7");
		System.out.println("Moe");
		System.out.println("Jay Green");
		System.out.println("Robert Blue");
		System.out.println("another code");
		
		System.out.println("changes in jc login page verify");
		System.out.println(" seconnde");
		
		System.out.println("------------------");
		String[] cars = {"Tesla", "Mercedes Benz", "BMW", "Lexus"};
		for (String i : cars) {
		System.out.println(" Niceeeee :-) ");
		System.out.println(i);
		}

	}
	
	@BeforeMethod
    public void setup() {

		String driverpath = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
	}
	
}



