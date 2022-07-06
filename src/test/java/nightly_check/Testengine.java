package nightly_check;

import org.testng.annotations.Test;

@Test

public class Testengine {
	
	@Test(priority=1)
	public void computer() {
		System.out.println("driver");
	}
	
	@Test(priority=2)
	public void age() {
		System.out.println(28);
	}
@Test(priority=3)
	public void book() {
		System.out.println("shakespeare");
	}
	
	

}
