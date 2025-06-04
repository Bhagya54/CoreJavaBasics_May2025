package day4;

public class ICICIBank implements RBI{

	public void deposit() {
		System.out.println("ICICI bank with deposit limit of 1 lakh");
	}

	@Override
	public void withdraw() {
		System.out.println("ICICI bank with withdraw limit of 2 lakhs");
		
	}

	@Override
	public void profit() {
		System.out.println("ICICI profit of 1 CR");
		
	}
}
