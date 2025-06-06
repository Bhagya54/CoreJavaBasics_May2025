package day4_Abstraction;

public class MainClass {

	public static void main(String[] args) {
		RBI r = new ICICIBank();
		r.deposit();
		
		r=new HDFCBank();
		r.deposit();
		//RBI rbi = new RBI();
		AbstractClassDemo c1 = new ChildClass();
		c1.a();
		//AbstractClassDemo a1 = new AbstractClassDemo();
		
		//WebDriver driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		//driver=new SafariDrive();
		
		
		

	}

}
