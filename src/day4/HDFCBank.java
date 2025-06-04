package day4;

public class HDFCBank implements RBI {

	@Override
	public void withdraw() {
		System.out.println("HDFC bank with withdraw limit of 2 lakh");
		
	}

	@Override
	public void deposit() {
		System.out.println("HDFC bank with deposit limit of 7 lakh");
		
	}

	@Override
	public void profit() {
		System.out.println("HDFC bank profit is 2 crore");
		
	}

}
